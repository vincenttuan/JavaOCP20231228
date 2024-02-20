package day03;

// String 與 StringBuilder
public class StringDemo4 {

	public static void main(String[] args) {
		String str = new String("test");
		str.concat(" mtest");
		StringBuilder strBuilder = new StringBuilder(" main");
		strBuilder.append(" mo");
		System.out.println(str + strBuilder);
		
		/*
		Select the one correct answer.
		(a) The program will fail to compile.
		(b) The program will print test mtest main mo, when run.
		(c) The program will print mtest main mo, when run.
		(d) The program will print test main mo, when run.
		(e) The program will print test mtest main, when run.
		*/
	}
	
}
