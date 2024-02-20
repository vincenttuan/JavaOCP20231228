package util;

public class ArrayUtil {
	// 計算總分
	public static int getSum(int[] scores) {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	// 計算平均
	public static double getAvg(int[] scores) {
		int sum = getSum(scores);
		double avg = sum / (double)scores.length;
		return avg;
	}
}
