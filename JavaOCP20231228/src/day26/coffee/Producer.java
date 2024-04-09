package day26.coffee;

// 生產者
public class Producer implements Runnable {
	
	// 訊息對列
	private MessageQueue queue;
	
	// 咖啡庫存
	private int coffeeStock;
	
	// 最大生產量
	private int maxAmount;
	
	public Producer(MessageQueue queue, int maxAmount) {
		this.queue = queue;
		this.maxAmount = maxAmount;
	}
	
	public int getMaxAmount() {
		return maxAmount;
	}
	
	@Override
	public void run() {
		System.out.println("生產者 run()");
		System.out.println("生產前庫存:" + coffeeStock);
		// 模擬生產咖啡
		queue.produce("拿鐵咖啡");
		// 庫存更新
		coffeeStock++;
		System.out.println("生產後庫存:" + coffeeStock);
	}
	
	
}
