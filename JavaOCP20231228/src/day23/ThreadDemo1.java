package day23;

public class ThreadDemo1 {

	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		// 我的任務
		System.out.println("我的任務:撰寫 Hello");
		// 印出執行緒名字 (main 又稱為主執行緒)
		System.out.println("執行緒名字: " + tName);
	}

}
