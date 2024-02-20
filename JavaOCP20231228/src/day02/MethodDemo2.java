package day02;

import static util.BMIUtil.calcBmi;
import static util.BMIUtil.getResult;
import static util.BMIUtil.calcBmiAndPrint;

public class MethodDemo2 {

	public static void main(String[] args) {
		double h1 = 170; // 170.0
		double w1 = 60;  // 60.0
		// 印出 bmi 資料 ?
		//double bmi1 = MethodDemo1.calcBmi(h1, w1);
		// 因為上面有宣告 import static day02.MethodDemo1.calcBmi 
		// 所以 MethodDemo1 可以不寫
		double bmi1 = calcBmi(h1, w1);  
		System.out.println(bmi1);
		
		String result1 = getResult(bmi1);
		System.out.println(result1);
		
		calcBmiAndPrint(h1, w1);
		
	}

}
