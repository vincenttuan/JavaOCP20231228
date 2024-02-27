package day15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class LambdaDemo4 {

	public static void main(String[] args) {
		// 練習 Supplier
		/*
		@FunctionalInterface
		public interface Supplier<T> {
			T get();
		}
		*/
		Supplier<Date> today = () -> new Date();
		System.out.println(today.get());
		
		Supplier<String> time = () -> {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			return sdf.format(today.get());
		};
		System.out.println(time.get());
	}

}
