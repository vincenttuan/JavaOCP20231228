package day23;

public class Total extends Thread {
	
	@Override
	public void run() { // Todo-list
		work();
	}
	
	private void work() {
		String tName = Thread.currentThread().getName();
		// 任務三: 1~1000 的所有數並逐項把累計資料印出
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			sum += i;
			System.out.printf("執行緒名字: %s, 數字 i = %d 累計總和 = %d%n", tName, i, sum);
		}
	}
}
