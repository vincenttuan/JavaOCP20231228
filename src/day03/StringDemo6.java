package day03;

// String 與 StringBuilder
public class StringDemo6 {

	public static void main(String[] args) {
		String str1 = new String("Duke");
		str1 = str1.intern();
        String str2 = "Duke";
        System.out.println(str1 == str2);
        
        /*
         * A. true
         * B. false
         * */
	}
	
}
