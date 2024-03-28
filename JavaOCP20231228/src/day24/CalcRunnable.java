package day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CalcRunnable implements Runnable {
	private String filePath;
	
	public CalcRunnable(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void run() {
		try {
			List<String> lines = Files.readAllLines(Path.of(filePath));
			int sum = lines.stream().mapToInt(Integer::parseInt).sum();
			System.out.printf("%s 總和: %d%n", filePath, sum);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
