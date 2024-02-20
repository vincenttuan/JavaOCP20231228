package day01;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		String[] cars = {"Honda", "Toyota", "Tesla", "BMW", "Benz", "BYD"};
		String[] types = {"油", "油", "電", "油", "油", "電"};
		int[] prices = {80_0000, 75_0000, 150_0000, 250_0000, 300_0000, 50_0000};
		// 寫一個程式可以將
		// case 1:
		// 將油車放到 String[] gasolineCars 陣列中
		// 將電車放到 String[] electricCars 陣列中
		// 最後各別印出 gasolineCars 與 electricCars 陣列中的資訊與台數
		// 印出範例: 油車有 4 台分別是: Honda, Toyota, BMW, Benz 
		// 印出範例: 電車有 2 台分別是: Tesla, BYD;
		
		// 計算出油車與電車的數量
		int gasolineCount = 0;
		int electricCount = 0;
		for(String type : types) {
			if(type.equals("油")) {
				gasolineCount++;
			} else if(type.equals("電")) {
				electricCount++;
			}
		}
		System.out.printf("油車有 %d 台%n", gasolineCount);
		System.out.printf("電車有 %d 台%n", electricCount);
		
		// 建立油車陣列與電車陣列
		String[] gasolineCars = new String[gasolineCount];
		String[] electricCars = new String[electricCount];
		
		// 建立油/電車放入資料的初始維度
		int gIndex = 0;
		int eIndex = 0;
		for(int i=0;i<types.length;i++) {
			if(types[i].equals("油")) {
				gasolineCars[gIndex] = cars[i];
				gIndex++;
			} else if(types[i].equals("電")) {
				electricCars[eIndex] = cars[i];
				eIndex++;
			}
		}
		System.out.printf("油車: %s%n", Arrays.toString(gasolineCars));
		System.out.printf("電車: %s%n", Arrays.toString(electricCars));
		
		// case 2:
		// 請找出最貴的價格,車名與車種(type)
		int maxPrice = 0;
		int maxIndex = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] > maxPrice) {
				maxPrice = prices[i];
				maxIndex = i;
			}
		}
		
		System.out.printf("最貴的價格: %,d 車名: %s 車種: %s%n", prices[maxIndex], cars[maxIndex], types[maxIndex]);
		
				
	}
}
