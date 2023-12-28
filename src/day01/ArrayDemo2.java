package day01;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		String[] cars = {"Honda", "Toyota", "Tesla", "BMW", "Benz", "BYD"};
		String[] type = {"油", "油", "電", "油", "油", "電"};
		// 寫一個程式可以將
		// 將油車放到 String[] gasolineCars 陣列中
		// 將電車放到 String[] electricCars 陣列中
		// 最後各別印出 gasolineCars 與 electricCars 陣列中的資訊與台數
		// 印出範例: 油車有 4 台分別是: Honda, Toyota, BMW, Benz 
		// 印出範例: 電車有 2 台分別是: Tesla, BYD;
		
		// 計算出油車與電車的數量
		int gasolineCount = 0;
		int electricCount = 0;
		for(String t : type) {
			if(t.equals("油")) {
				gasolineCount++;
			} else if(t.equals("電")) {
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
		for(int i=0;i<type.length;i++) {
			if(type[i].equals("油")) {
				gasolineCars[gIndex] = cars[i];
				gIndex++;
			} else if(type[i].equals("電")) {
				electricCars[eIndex] = cars[i];
				eIndex++;
			}
		}
		System.out.printf("油車: %s%n", Arrays.toString(gasolineCars));
		System.out.printf("電車: %s%n", Arrays.toString(electricCars));
	}
}
