package day15;

import java.util.Arrays;

public class LambdaDemo5 {

	public static void main(String[] args) {
		// 混用
		Integer[] scores = {100, 50, 70, 40, 90};
		// 將所有分數印出
		// 利用 stream 串流來分析
		// 將 Integer[] 陣列透過 Arrays.stream() 轉串流
		//Arrays.stream(scores).forEach(x -> System.out.println(x));
		
		// 印出及格的分數
		Arrays.stream(scores).forEach(x -> {
			if(x >= 60) {
				System.out.println(x);
			}
		});
		
	}

}
