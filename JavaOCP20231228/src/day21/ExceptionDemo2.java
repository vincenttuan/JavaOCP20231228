package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		while (true) {
			if(input()) {
				break;
			}
		}
	}
	
	public static boolean input() {
		Scanner scanner = new Scanner(System.in);
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
		} finally {
			scanner.close();
		}
		return false;
	}

}
