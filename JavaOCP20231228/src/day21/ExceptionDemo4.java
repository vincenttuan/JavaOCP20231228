package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			while (true) {
				if(input(scanner)) {
					break;
				}
			}
		} // 會自動執行關閉
	}
	
	public static boolean input(Scanner scanner) {
		try {
			System.out.print("請輸入分子:");
			int x = scanner.nextInt();
			System.out.print("請輸入分母:");
			int y = scanner.nextInt();
			int result = x / y;
			System.out.printf("result = %d%n", result);
			return true;
		} catch	(InputMismatchException e1) {
			System.out.println("輸入錯誤, 錯誤原因:" + e1);
			System.out.println("請重新輸入");
		} catch (ArithmeticException e2) {
			System.out.println("計算錯誤, 錯誤原因:" + e2);
			System.out.println("請重新輸入");
		}
		scanner.nextLine(); // 避免重複循環
		return false;
	}

}
