package day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StudentScoreSystem {
	public static void main(String[] args) {
		StudentScoreSystem system = new StudentScoreSystem();
		// 1. 讀取檔案(score.csv)
		system.readFile("src\\day22\\output\\score.csv");
		// 2. 分析內容
		
		// 3. 輸出分析內容(result.csv)
		
		// 4. 登入程序
		
		// 5. 批次匯入(result.csv)
		
	}
	
	// 1. 讀取檔案(score.csv)
	public List<Score> readFile(String filePath) {
		String content = null;
		try {
			content = Files.readString(Path.of(filePath));
		} catch (IOException e) {
			System.out.println("IO 錯誤: " + e);
			return null; // 回傳空值表示無資料
		}	
		// 印出 content
		System.out.println(content);
		
		return null;
	} 
}
