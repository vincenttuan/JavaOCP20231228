package day13;

public class Outer2 {
	
	public void myMethod() {
		final int x = 200;
		int y = 100;
		//y = 101;
		// 方法內部類別
		class Inner {
			void callMe() {
				System.out.println(x);
				System.out.println(y); // Java 8 之後若方法內部類別可以"合法使用"區域變數, 會自行加上 final
			}
		}
		// 建立方法內部類別物件並使用
		Inner inner = new Inner();
		inner.callMe();
	}
	
	public void test() {
		class Inner {
			void print() {
				System.out.println("Print me !");
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
	
	
	
}
