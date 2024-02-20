package day14;

public class Form {
	int num = 0;
	
	public class ButtonA {
		int num = 0;
		public void onClick() {
			System.out.println("ButtonA this.num: " + (++this.num));
			System.out.println("Form.this.num: " + (++Form.this.num));
			ButtonC.count--; // 次數減一
		} 
	}
	
	public class ButtonB {
		int num = 0;
		public void onClick() {
			System.out.println("ButtonB this.num: " + (++this.num));
			System.out.println("Form.this.num: " + (++Form.this.num));
			ButtonC.count--; // 次數減一
		} 
	}
	
	public static class ButtonC{
		static int count = 100;
		public static void displayCount() {
			System.out.println("ButtonC static count: " + (ButtonC.count));
		}
	}
	
}
