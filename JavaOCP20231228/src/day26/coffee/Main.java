package day26.coffee;

public class Main {
	public static void main(String[] args) throws Exception {
		MessageQueue queue = new MessageQueue();
		Producer producer = new Producer(queue, 20);
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);
		
		// 啟動消費者執行緒
		new Thread(consumer1, "小明").start(); // 消費啟動
		new Thread(consumer2, "小英").start(); // 消費啟動
		
		// 生產者不斷生產咖啡
		for(int i=1;i<=producer.getMaxAmount();i++) {
			Thread.sleep(1000);
			new Thread(producer).start(); // 生產啟動
		}
		
	}
}
