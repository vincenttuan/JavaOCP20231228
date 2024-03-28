package day24;

import java.util.Date;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Runnable job1 = () -> {
			long startTime = new Date().getTime();
			Fibonacci fibonacci = new Fibonacci();
			long n = 50;
			long result = fibonacci.fib(n);
			long endTime = new Date().getTime();
			System.out.printf("fibonacci[%d] = %d time: %d%n", n, result, (endTime - startTime));
		};
		
		Thread t1 = new Thread(job1);
		t1.start();
		
		
	}
}
