package day25;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadDemo10 {
	
	public static void main(String[] args) {
		Account account = new Account(10000);
		
		// 透過 ThreadFactory 來為存款任務調高優先權
		ThreadFactory threadFactory = (runnable) -> {
			Thread thread = new Thread(runnable);
			if(runnable instanceof Deposit) {
				thread.setPriority(Thread.MAX_PRIORITY);
			} else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			return thread;
		};
		
		// 使用執行緒服務 + stream
		// 工作列表
		List<Runnable> tasks = List.of(
				new Withdraw(account, 5000),
				new Withdraw(account, 4000),
				new Withdraw(account, 3000),
				new Deposit(account, 2000),
				new Deposit(account, 1000)
		);
		
		//ExecutorService executor = Executors.newFixedThreadPool(5, threadFactory);
		ExecutorService executor = Executors.newCachedThreadPool(threadFactory);
		
		// 使用 Stream API 提交任務
		//tasks.stream().forEach(task -> executor.execute(task));
		tasks.stream().forEach(executor::execute);
		
		// 任務完成關閉服務
		executor.shutdown();
		
		
	}
}
