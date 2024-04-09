package day26.coffee;

public class Consumer implements Runnable {
	
	private MessageQueue queue;
	
	public Consumer(MessageQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		System.out.println("消費者 run()");
		// 消費者想買 10 杯咖啡
		for(int i=1;i<=10;i++) {
			String data = queue.consume(); // 從對列中取出一杯咖啡
			// 消費 data
			System.out.printf("消費者喝了第 %d 杯 %s%n", i, data);
		}
	}

}
