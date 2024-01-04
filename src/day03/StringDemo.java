package day03;

// String 與 StringBuilder
public class StringDemo {

	public static void main(String[] args) {
		String s = "Java";
		update(s);
		System.out.println(s);
	}
	
	public static void update(String s) {
		s = s.concat("8");
	}
	
}
