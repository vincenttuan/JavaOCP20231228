package day21;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分子:");
		int x = scanner.nextInt();
		System.out.print("請輸入分母:");
		int y = scanner.nextInt();
		int result = x / y;
		System.out.printf("result = %d%n", result);
	}

}
