package day24;

import java.util.List;

public class ThreadDemo6 {
	public static void main(String[] args) {
		// 檔案列表
		List<String> filePaths = List.of("src/day24/score1.txt", "src/day24/score2.txt", "src/day24/score3.txt");
		
		filePaths.forEach(filePath -> {
			CalcRunnable calc = new CalcRunnable(filePath);
			Thread t = new Thread(calc);
			t.start();
		});
		
		
	}
}
