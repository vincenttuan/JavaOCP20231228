package day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StudentScoreSystem {
	public static void main(String[] args) {
		StudentScoreSystem system = new StudentScoreSystem();
		// 1. 讀取檔案(score.csv)
		Set<Score> scores = system.readFile("src\\day22\\output\\score.csv");
		System.out.println(scores);
		// 2. 分析內容
		
		// 3. 輸出分析內容(result.csv)
		
		// 4. 登入程序
		
		// 5. 批次匯入(result.csv)
		
	}
	
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
			String data = rows[i]; // John,100,90,80
			String[] parts = data.split(","); // 拆解
			Score score = new Score();
			score.setStudentName(parts[0]);
			score.setChinese(Integer.parseInt(parts[1]));
			score.setEnglish(Integer.parseInt(parts[2]));
			score.setMath(Integer.parseInt(parts[3]));
			// 注入到 scores 集合中保存
			scores.add(score);
		}
		return scores;
	}
	
	
}
