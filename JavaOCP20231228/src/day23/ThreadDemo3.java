package day23;

public class ThreadDemo3 {

	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		System.out.printf("執行緒名字: %s, 啟動%n", tName);
		
		Even even = new Even(); // Even 執行緒物件
		Odd odd = new Odd();    // Odd 執行緒物件
		System.out.printf("執行緒名字: %s, 指派 Even 與 Odd 來執行任務%n", tName);
		
		even.start(); // 開始執行任務
		odd.start();  // 開始執行任務
		
		System.out.printf("執行緒名字: %s, 結束%n", tName);
	}

}
