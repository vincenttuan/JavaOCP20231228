package day26.coffee;

import java.util.LinkedList;
import java.util.Queue;

// 訊息對列
public class MessageQueue {
	
	// 存放訊息的集合
	private Queue<String> queue = new LinkedList<>();
	
	// 生產
	public synchronized void produce(String message) {
		System.out.println("生產者將 " + message + " 放到對列中");
		queue.add(message); // 將新的訊息放到對列中
		notify(); // 通知消費者進行消費
	}
	
	// 消費
	public synchronized String consume() {
		// 查驗 queue 是否有資料
		if(queue.isEmpty()) {
			System.out.println("消費者等待中...");
			try {
				wait(); // 等待生產者的通知
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String data = queue.poll(); // 將資料取出
		return data;
	}
	
	
}
