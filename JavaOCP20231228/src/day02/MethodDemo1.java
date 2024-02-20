package day02;

import static util.BMIUtil.calcBmi;
import static util.BMIUtil.getResult;
import static util.BMIUtil.calcBmiAndPrint;

public class MethodDemo1 {
	
	// 主方法
	public static void main(String[] args) {
		double h1 = 170; // 170.0
		double w1 = 60;  // 60.0
		// 調用 calcBmiAndPrint(h, w) 方法
		calcBmiAndPrint(h1, w1);
		
		double h2 = 160.5;
		double w2 = 55.1;
		calcBmiAndPrint(h2, w2);
		
		double h3 = 185;
		double w3 = 60;
		double bmi3 = calcBmi(h3, w3);
		String result3 = getResult(bmi3);
		System.out.printf("%.1f %s%n", bmi3, result3);
	}
	
}
