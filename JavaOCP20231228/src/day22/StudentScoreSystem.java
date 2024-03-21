package day22;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentScoreSystem {
	public static void main(String[] args) {
		ScoreProcessor scoreProcessor = new ScoreProcessor();
		// 1. 讀取檔案(score.csv)
		Set<Score> scores = scoreProcessor.readFile2("src\\day22\\output\\score.csv");
		System.out.println("1. 讀取檔案(score.csv):" + scores);
		// 2. 分析內容
		scoreProcessor.scoreAnalysis(scores);
		System.out.println("2. 分析內容:" + scores);
		// 3. 輸出分析內容(result.csv)
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
			System.out.println("3. 輸出分析內容(result.csv)建立檔案與寫入資料成功");
		} catch (Exception e) {
			System.out.println("3. 輸出分析內容(result.csv)建立檔案與寫入資料成功失敗, " + e);
		}
		
		
		// 4. 登入程序
		
		// 5. 批次匯入(result.csv)
		
	}
}
