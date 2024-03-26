package day23;

import java.util.List;

public class StreamAndParallelStream {
	public static void main(String[] args) {
		// stream() 順序流 (單一處理器上集中處理任務)
		// parallelStream() 併行(平行)流 (多核處理器上分散處理任務)
		
		List<Integer> numbers = List.of(1, 3, 5, 7, 9);
		
		// 計算平方總和
		int sumOfSquares = numbers.parallelStream()
								  .mapToInt(x -> x * x)
								  .peek(System.out::println)
								  .sum();
		
		System.out.println("計算平方總和: " + sumOfSquares);
	}
}
