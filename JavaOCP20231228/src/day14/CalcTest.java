package day14;

public class CalcTest {
	public static void main(String[] args) {
		// 實作 Calc 的介面-加法運算
		Calc add1 = new Calc() {
			@Override
			public int compute(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(add1.compute(10, 20));
		
	}
}
