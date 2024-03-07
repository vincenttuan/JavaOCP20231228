package day18;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(3);
		queue.offer(6);
		queue.offer(9);
		System.out.printf("size:%d value:%s%n", queue.size(), queue);
		
		// 將每一個元素提出後進行平方, 最後計算出平方和
		int sum = 0;
		while(!queue.isEmpty()) {
			Integer value = queue.poll();
			sum += Math.pow(value, 2);
			// 觀察
			System.out.printf("size:%d value:%s%n", queue.size(), queue);
		}
		System.out.println(sum);
	}

}
