package util;

public class BMIUtil {
	// 建立一個可以計算出 bmi 並回傳 bmi值(double) 的方法
	public static double calcBmi(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}
	
	// 建立一個可以根據 bmi 得到結果的方法
	public static String getResult(double bmi) {
		String result = "正常";
		if(bmi > 23) {
			result = "過重";
		} else if(bmi <= 18) {
			result = "過輕";
		}
		return result;
	}
	
	// 建立一個可以根據 bmi, sex 得到結果的方法
	public static String getResult(double bmi, String sex) {
		int delta = sex.equals("男") ? 2 : 0;
		String result = "正常";
		if(bmi > (23 + delta)) {
			result = "過重";
		} else if(bmi <= (18 + delta)) {
			result = "過輕";
		}
		return result;
	}
	
	// 建立一個可以計算 bmi 與印出 bmi 資料的方法
	// 此方法需要 2 個參數, 分別是 h(身高), w(體種)
	// 此方法執行完後不會有任何回傳值
	public static void calcBmiAndPrint(double h, double w) {
		double bmi = calcBmi(h, w);
		String result = getResult(bmi);
		System.out.printf("身高: %.1f 體重: %.1f bmi: %.2f 結果: %s%n", h, w, bmi, result);
	}
	
}
