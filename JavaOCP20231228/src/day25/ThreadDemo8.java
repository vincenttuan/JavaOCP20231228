package day25;

public class ThreadDemo8 {
	public static void main(String[] args) {
		Account account = new Account(10000);
		
		// 工作
		Runnable r1 = new Withdraw(account, 5000);
		Runnable r2 = new Withdraw(account, 4000);
		Runnable r3 = new Withdraw(account, 3000);
		
		// 執行工作者
		Thread t1 = new Thread(r1, "John");
		Thread t2 = new Thread(r2, "Helen");
		Thread t3 = new Thread(r3, "Mary");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
