package day24;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Runnable job1 = () -> {
			Fibonacci fibonacci = new Fibonacci();
			long n = 10;
			long result = fibonacci.fib(n);
			System.out.printf("fibonacci[%d] = %d%n", n, result);
		};
		
		Thread t1 = new Thread(job1);
		t1.start();
		
		
	}
}
