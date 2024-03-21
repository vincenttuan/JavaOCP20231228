package day22;

import java.util.Set;

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
		Boolean isWriteOK = scoreProcessor.writeFile("src\\day22\\output\\result.csv", scores);
		System.out.println("3. 輸出分析內容(result.csv)建立檔案與寫入資料" + (isWriteOK?"成功":"失敗"));
		if(!isWriteOK) {
			return;
		}
		
		// 4. 登入程序
		ScoreDao scoreDao = new ScoreDao();
		Boolean isLoginOK = scoreDao.login();
		System.out.println("4. 登入程序-登入" + (isLoginOK?"成功":"失敗"));
		if(!isLoginOK) {
			return;
		}
		
		// 5. 批次匯入(result.csv)
		Boolean isBatchOK = scoreDao.batchUpdate(scores);
		System.out.println("5. 批次匯入(result.csv)" + (isBatchOK?"成功":"失敗"));
		
	}
}
