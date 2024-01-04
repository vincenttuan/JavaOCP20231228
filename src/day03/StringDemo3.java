package day03;

// String 與 StringBuilder
public class StringDemo3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		update(sb);
		System.out.println(sb);
	}
	
	public static void update(StringBuilder sb) {
		sb.append("8");
	}
	
}
