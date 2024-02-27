package day15;

import java.util.function.Predicate;

public class LambdaDemo3 {

	public static void main(String[] args) {
		// 練習 Predicate
		/*
		@FunctionalInterface
		public interface Predicate<T> {
			boolean test(T t);
		}
		*/
		
		Predicate<Integer> pass = (score) -> score >= 60;
		System.out.println(pass.test(45));
		System.out.println(pass.test(85));
		
		Predicate<String> idSex = (id) -> id.charAt(1) == '1';
		System.out.println(idSex.test("A123456789"));
		System.out.println(idSex.test("H223456789"));
		
		String[] names = {"Jo", "Vincent", "Anita", "Baby", "Howard", "Joanna"};
		// 請寫一個 Predicate 並可以將名字長度 > 4 的名字印出
		
	}

}
