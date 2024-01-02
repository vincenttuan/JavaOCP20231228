package day02;

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
	}
	
	// 建立一個可以計算 bmi 與印出 bmi 資料的方法
	// 此方法需要 2 個參數, 分別是 h(身高), w(體種)
	// 此方法執行完後不會有任何回傳值
	private static void calcBmiAndPrint(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		String result = "正常";
		if(bmi > 23) {
			result = "過重";
		} else if(bmi <= 18) {
			result = "過輕";
		}
		System.out.printf("身高: %.1f 體重: %.1f bmi: %.2f 結果: %s%n", h, w, bmi, result);
	}

}
