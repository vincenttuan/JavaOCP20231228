package day23;

public class Even extends Thread {
	
	@Override
	public void run() { // Todo-list
		work();
	}
	
	private void work() {
		String tName = Thread.currentThread().getName();
		// 任務一: 1~1000 的所有偶數並逐項把累計資料印出
		int sumOfEven = 0;
		for(int i=1;i<=1000;i++) {
			if(i % 2 == 0) {
				sumOfEven += i;
				System.out.printf("執行緒名字: %s, 偶數 i = %d 累計總和 = %d%n", tName, i, sumOfEven);
			}
		}
	}
}
