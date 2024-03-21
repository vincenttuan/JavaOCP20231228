package day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

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
