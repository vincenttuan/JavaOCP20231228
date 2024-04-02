package day25;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {
	public static void main(String[] args) {
		Account account = new Account(10000);
		
		// 使用執行緒服務 + stream
		// 工作列表
		List<Runnable> tasks = List.of(
				new Withdraw(account, 5000),
				new Withdraw(account, 4000),
				new Withdraw(account, 3000),
				new Deposit(account, 2000),
				new Deposit(account, 1000)
		);
		
		// 使用 CachedThreadPool 或 newFixedThreadPool 管理執行緒
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		// 使用 Stream API 提交任務
		tasks.stream().forEach(task -> executor.execute(task));
		
		// 任務完成關閉服務
		executor.shutdown();
		
	}
}
