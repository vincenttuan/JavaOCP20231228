package day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScoreProcessor {
	// 1. 讀取檔案(score.csv)
	public Set<Score> readFile(String filePath) {
		String content = null;
		try {
			content = Files.readString(Path.of(filePath));
		} catch (IOException e) {
			System.out.println("IO 錯誤: " + e);
			return null; // 回傳空值表示無資料
		}	
		// 印出 content
		//System.out.println(content);
		// 利用 "\r\n" <- Windows 的 Enter unicode (拆解資料)
		String[] rows = content.split("\r\n"); // 拆解
		//System.out.println(Arrays.toString(rows));
		Set<Score> scores = new LinkedHashSet<>();
		// 逐筆將資料拆解後放到 scores 集合中
		for(int i=1;i<rows.length;i++) {
			String line = rows[i]; // John,100,90,80
			Score score = lineToScore(line);
			// 注入到 scores 集合中保存
			scores.add(score);
		}
		return scores;
	}
	
	// 利用 Java Stream 來進行讀取檔案工作
	public Set<Score> readFile2(String filePath) {
		Set<Score> scores = null;
		try(Stream<String> lines = Files.lines(Path.of(filePath))) {
			scores = lines
					.skip(1) // 跳過一行
					.map(this::lineToScore) //.map(line -> lineToScore(line))
					.collect(Collectors.toSet());
		} catch (IOException e) {
			return null;
		}
		return scores;
	}
	
	// 2. 分析內容
	public void scoreAnalysis(Set<Score> scores) {
		scores.stream().forEach(score -> {
			score.setSum(score.getChinese() + score.getEnglish() + score.getMath());
			score.setAvg(score.getSum() / 3.0);
		});
	}
	
	// 3. 輸出分析內容(result.csv)
	public Boolean writeFile(String filePath, Set<Score> scores) {
		// CSV的頭部
		String header = "name,chinese,english,math,sum,avg\n";
		
		// 使用 Steam 將 scores 集合轉換為 CSV 格式
		String csvContent = scores.stream()
				.map(score -> String.join(",", 
						score.getStudentName(), 
						score.getChinese().toString(), 
						score.getEnglish().toString(), 
						score.getMath().toString(), 
						score.getSum().toString(), 
						String.format("%.1f", score.getAvg())))
				.collect(Collectors.joining("\n", header, "")); // 每一筆資料以 \n 隔開, 加入表頭, 尾末資訊
		
		Path path = Path.of("src\\day22\\output\\result.csv");
		try {
			// 先刪除舊檔案
			Files.deleteIfExists(path);
			// 建立檔案並新增內容
			Files.writeString(
					path, 
					csvContent, 
					StandardOpenOption.CREATE); // 創建新文件, 若文件存在則覆蓋
			return true;
		} catch (Exception e) {
			e.printStackTrace(); // 印出錯誤堆疊內的所有資訊(詳細錯誤資訊)
			return false;
		}
	}
	
	// 將字串拆解成 Score 物件
	private Score lineToScore(String line) {
		String[] parts = line.split(","); // 拆解
		Score score = new Score();
		score.setStudentName(parts[0]);
		score.setChinese(Integer.parseInt(parts[1]));
		score.setEnglish(Integer.parseInt(parts[2]));
		score.setMath(Integer.parseInt(parts[3]));
		return score;
	}
}
