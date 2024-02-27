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
		

	}

}
