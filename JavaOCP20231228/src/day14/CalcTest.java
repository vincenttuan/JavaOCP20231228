package day14;

public class CalcTest {
	public static void main(String[] args) {
		// 實作 Calc 的介面-加法運算: 透過匿名內部類別
		Calc add = new Calc() {
			@Override
			public int compute(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		System.out.println(add.compute(10, 20));
		
		// 利用 Lambda 1
		Calc add1 = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(add1.compute(10, 20));
		
		// 利用 Lambda 2
		Calc add2 = (x, y) -> {
			int result = x + y;
			return result;
		}; 
		System.out.println(add2.compute(10, 20));
		
		// 利用 Lambda 3
		Calc add3 = (x, y) -> {
			return x + y;
		}; 
		System.out.println(add3.compute(10, 20));
		
		// 利用 Lambda 4
		Calc add4 = (x, y) -> {return x + y;}; 
		System.out.println(add4.compute(10, 20));
		
		// 利用 Lambda 5
		Calc add5 = (x, y) -> x + y; 
		System.out.println(add5.compute(10, 20));
		
	}
}
