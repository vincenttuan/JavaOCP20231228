package day23;

public class ThreadDemo3 {

	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		System.out.printf("執行緒名字: %s, 啟動%n", tName);
		
		Even even = new Even(); // Even 執行緒物件
		Odd odd = new Odd();    // Odd 執行緒物件
		Total total = new Total(); // 再加上一個 Total 執行緒物件 (不分奇數與偶數)
		System.out.printf("執行緒名字: %s, 指派 Even, Odd 與 Total 來執行任務%n", tName);
		
		even.start(); // 開始執行任務
		odd.start();  // 開始執行任務
		total.start(); // 開始執行任務
		
		// 總共有幾條執行緒
		System.out.printf("運行中執行緒數量: %d%n", Thread.activeCount());
		
		System.out.printf("執行緒名字: %s, 結束%n", tName);
	}

}
