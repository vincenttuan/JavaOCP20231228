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
		
		Integer[] radius = {10, 15, 7, 2};
		// 請分別計算圓面積與球體積
		for(Integer r : radius) {
			Double area1 = calcArea.apply(r);
			Double volume1 = calcVolume.apply(r);
			//System.out.printf("半徑: %d 圓面積: %.2f 球體積: %.2f%n", r, area1, volume1);
			//System.out.printf("半徑: %02d 圓面積: %06.2f 球體積: %08.2f%n", r, area1, volume1);
			System.out.printf("半徑: %2d 圓面積: %6.2f 球體積: %8.2f%n", r, area1, volume1);
		}
		
	}
}
