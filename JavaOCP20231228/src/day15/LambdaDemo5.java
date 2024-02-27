package day15;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo5 {

	public static void main(String[] args) {
		// 混用
		Integer[] scores = {100, 50, 70, 40, 90};
		// 將所有分數印出
		// 利用 stream 串流來分析
		// 將 Integer[] 陣列透過 Arrays.stream() 轉串流
		//Arrays.stream(scores).forEach(x -> System.out.println(x));
		
		// 印出及格的分數 part I
		/*
		Arrays.stream(scores).forEach(x -> {
			if(x >= 60) {
				System.out.println(x);
			}
		});
		*/
		
		// 印出及格的分數 part II
		Arrays.stream(scores)
			  .filter(x -> x >= 60)
			  .forEach(x -> System.out.println(x));
		
		
		// 印出及格的分數 part III
		Predicate<Integer> pass = (x) -> x >= 60;
		Predicate<Integer> fail = (x) -> x < 60;
		Consumer<Integer> display = (x) -> System.out.println(x);
		Arrays.stream(scores)
		  	  .filter(fail)
		  	  .forEach(display);
		
	}

}
