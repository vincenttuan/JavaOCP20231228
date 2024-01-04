package day03;

// String 與 StringBuilder
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "Java";
		s = update(s);
		System.out.println(s);
	}
	
	public static String update(String s) {
		s = s.concat("8");
		return s;
	}
	
}
