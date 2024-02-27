package day15;

import java.util.Arrays;

public class LambdaDemo6 {
	public static void main(String[] args) {
		// 混用 Function, Predicate, Consumer
		String[] scores = {"100", "50", "70", "40", "90"};
		// 請印出及格的分數
		for(String str : scores) {
			// 1.字串轉換成(map)數字
			int score = Integer.parseInt(str);
			// 2.判斷過濾(filter)是否及格
			if(score >= 60) {
				// 3. 印出
				System.out.println(score);
			}
		}
		
		// 用 stream
		Arrays.stream(scores)
			  .map(x -> Integer.parseInt(x))        // 轉換 map(Function)
			  .filter(x -> x >= 60)                 // 過濾 filter(Predicate)
			  .forEach(x -> System.out.println(x)); // 逐項 forEach(Consumer)
		
		
	}
}
