package day15;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class LambdaDemo7 {
	public static void main(String[] args) {
		String[] names = {"Jo", "Vincent", "Anita", "Baby", "Howard", "Joanna"};
		// 利用 stream 計算出平均字數
		// {"Jo", "Vincent", "Anita", "Baby", "Howard", "Joanna"}  String stream
		// 轉換
		// {2, 7, 5, 4, 6, 6}                                      int stream
		// 計算平均
		
		double avg = Arrays.stream(names).mapToInt(x -> x.length()).average().getAsDouble();
		System.out.println(avg);
		
		// 統計資料
		IntSummaryStatistics stat = Arrays.stream(names).mapToInt(x -> x.length()).summaryStatistics();
		System.out.println("最大值: " + stat.getMax());
		System.out.println("最小值: " + stat.getMin());
		System.out.println("平均: " + stat.getAverage());
		System.out.println("總和: " + stat.getSum());
		System.out.println("個數: " + stat.getCount());
		
	}
}
