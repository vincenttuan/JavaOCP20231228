package day22;

import java.util.Set;

public class StudentScoreSystem {
	public static void main(String[] args) {
		ScoreProcessor scoreProcessor = new ScoreProcessor();
		// 1. 讀取檔案(score.csv)
		Set<Score> scores = scoreProcessor.readFile2("src\\day22\\output\\score.csv");
		System.out.println("1. 讀取檔案(score.csv):" + scores);
		// 2. 分析內容
		
		// 3. 輸出分析內容(result.csv)
		
		// 4. 登入程序
		
		// 5. 批次匯入(result.csv)
		
	}
}
