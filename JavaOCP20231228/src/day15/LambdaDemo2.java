package day15;

import java.util.function.Function;

public class LambdaDemo2 {
	public static void main(String[] args) {
		// 練習 Function 
		/*
		@FunctionalInterface
		public interface Function<T, R> {
			R apply(T t);
		}
		*/
		
		//Function<Integer, Double> calcArea = (r) -> r * r * 3.14;
		Function<Integer, Double> calcArea = (r) -> Math.pow(r, 2) * Math.PI;
		
		// 計算半徑=10的圓面積
		Double area = calcArea.apply(10);
		System.out.println(area);
		
	}
}
