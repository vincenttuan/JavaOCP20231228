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
		
		// 計算圓面積
		//Function<Integer, Double> calcArea = (r) -> r * r * 3.14;
		Function<Integer, Double> calcArea = (r) -> Math.pow(r, 2) * Math.PI;
		
		// 計算半徑=10的圓面積
		Double area = calcArea.apply(10);
		System.out.println(area);
		
		// 計算球體積  
		Function<Integer, Double> calcVolume = (r) -> 4/3.0 * Math.PI * Math.pow(r, 3);
		Double volume = calcVolume.apply(10);
		System.out.println(volume);
		
		
	}
}
