package day14;

import static java.lang.Math.pow;

public class BMITest {

	public static void main(String[] args) {
		// 利用 Lambda 來實作 BMI
		// 並計算出 h = 170, w = 60 的 bmi 值 (小數點 2 位)
		BMI bmi = new BMI() {
			@Override
			public double calc(double h, double w) {
				double result = w / Math.pow(h/100.0, 2);
				return result;
			}
		};
		
		// Lambda 1
		BMI bmi1 = (h, w) -> w / Math.pow(h/100.0, 2);
		
		// Lambda 2
		BMI bmi2 = (h, w) -> w / pow(h/100.0, 2);
		
		System.out.println(bmi2.calc(170, 60)); // 170.0, 60.0
		
		System.out.printf("%.2f%n", bmi2.calc(170, 60));
	}

}
