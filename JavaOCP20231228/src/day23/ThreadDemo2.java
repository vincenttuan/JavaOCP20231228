package day23;

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		// 有二個任務
		// 任務一: 1~1000 的所有偶數並逐項把累計資料印出
		int sumOfEven = 0;
		for(int i=1;i<=1000;i++) {
			if(i % 2 == 0) {
				sumOfEven += i;
				System.out.printf("執行緒名字: %s, 偶數 i = %d 累計總和 = %d%n", tName, i, sumOfEven);
			}
		}
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
