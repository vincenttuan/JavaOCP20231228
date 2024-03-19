package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("請輸入分子:");
			int x = scanner.nextInt();
			System.out.print("請輸入分母:");
			int y = scanner.nextInt();
			int result = x / y;
			System.out.printf("result = %d%n", result);
		} catch	(InputMismatchException e) {
			System.out.println("分子輸入錯誤, 錯誤原因:" + e);
			System.out.println("請重新輸入");
			input(); // 重新執行
		}
	}

}