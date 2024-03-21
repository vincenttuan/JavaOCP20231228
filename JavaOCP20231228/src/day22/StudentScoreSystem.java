package day22;

import java.util.Set;

public class StudentScoreSystem {
	public static void main(String[] args) {
		ScoreProcessor scoreProcessor = new ScoreProcessor();
		// 1. 讀取檔案(score.csv)
		Set<Score> scores = scoreProcessor.readFile2("src\\day22\\output\\score.csv");
		System.out.println("1. 讀取檔案(score.csv):" + scores);
		// 2. 分析內容
		scores.stream().forEach(score -> {
			score.setSum(score.getChinese() + score.getEnglish() + score.getMath());
			score.setAvg(score.getSum() / 3.0);
		});
		System.out.println("2. 分析內容:" + scores);
		// 3. 輸出分析內容(result.csv)
		
		// 4. 登入程序
		
		// 5. 批次匯入(result.csv)
		
	}
}
