package day13;

// 外部類別
public class Outer {
	int x = 7;        // Outer 的物件變數
	static int s = 9; // Outer 的類別變數
	
	class Inner { // 一般內部類別 (不可以有 static 成員)
		int x = 77; // Inner 的物件變數
		//static int s = 99; // 因為 Inner 是一般內部類別, 所以不可以有 static 成員
		void callMe() { // 內部類別的方法
			int x = 777; // 區域變數
			System.out.println("Hello 內部類別");
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
			System.out.println(Outer.s); // 9
		}
		
	}
	
}
