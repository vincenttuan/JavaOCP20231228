package day23;

public class Odd extends Thread {
	private void job() {
		String tName = Thread.currentThread().getName();
		// 任務二: 1~1000 的所有奇數並逐項把累計資料印出
		int sumOfOdd = 0;
		for(int i=1;i<=1000;i++) {
			if(i % 2 == 1) {
				sumOfOdd += i;
				System.out.printf("執行緒名字: %s, 奇數 i = %d 累計總和 = %d%n", tName, i, sumOfOdd);
			}
		}
	}
}
