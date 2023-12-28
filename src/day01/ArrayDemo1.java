package day01;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		String[] cars = {"Honda", "Toyota", "BMW", "Benz", "BYD", "Tesla"};
		System.out.println(cars);
		System.out.println(cars.length);
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars[4]);
		System.out.println(cars[5]);
		// 利用 for-loop 將 cars 的內容印出
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		// 利用 for-each 將 cars 的內容印出
		for(String car : cars) {
			System.out.println(car);
		}
		// 利用 Arrays.toString() 將 cars 的內容印出
		System.out.println(Arrays.toString(cars));
		
		// 陣列複製
		String[] copiedCars = new String[cars.length];
		// 利用 System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//System.arraycopy(cars, 0, copiedCars, 0, cars.length);
		System.arraycopy(cars, 1, copiedCars, 3, 2);
		System.out.println(Arrays.toString(copiedCars));
		
	}

}
