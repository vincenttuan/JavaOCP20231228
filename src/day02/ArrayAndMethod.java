package day02;

import static util.ArrayUtil.getSum;
import static util.ArrayUtil.getAvg;

public class ArrayAndMethod {

	public static void main(String[] args) {
		int[] scores1 = {100, 90, 80};
		int[] scores2 = {70, 60, 50};
		// 請分別計算出總分與平均 ?
		// case I
		int sum1 = getSum(scores1);
		double avg1 = getAvg(scores1);
		int sum2 = getSum(scores2);
		double avg2 = getAvg(scores2);
		System.out.printf("score1: 總分: %d 平均: %.1f%n", sum1, avg1);
		System.out.printf("score2: 總分: %d 平均: %.1f%n", sum2, avg2);
		
		// case II
		System.out.printf("score1: 總分: %d 平均: %.1f%n", getSum(scores1), getAvg(scores1));
		System.out.printf("score2: 總分: %d 平均: %.1f%n", getSum(scores2), getAvg(scores2));
		
		
	}

}
