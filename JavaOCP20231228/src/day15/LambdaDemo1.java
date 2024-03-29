package day15;

import java.util.function.Consumer;

public class LambdaDemo1 {

	public static void main(String[] args) {
		// 練習 Consumer
		/*
		 	@FunctionalInterface
			public interface Consumer<T> {
				void accept(T t);
			}	
		*/
		
		Consumer<String> hello = (t) -> System.out.println("哈囉 " + t);
		Consumer<Integer> calc = (t) -> System.out.println(t + t);
		Consumer test = (t) -> System.out.println(t);
		
		hello.accept("John");
		calc.accept(10);
		test.accept("abc");
		test.accept(10);
		
		String[] names = {"John", "Bob", "Mary", "Jack", "Rose"};
		for(String name : names) {
			hello.accept(name);
		}
		
	}

}
