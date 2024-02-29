package day16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		//Set set = new HashSet();      // [80, 英, 65, 韓, 100, 日, 70, 國] 無序
		Set set = new LinkedHashSet();  // [國, 100, 英, 70, 日, 80, 韓, 65] 有序
		set.add("國"); // String
		set.add(100); // Integer
		set.add("英");
		set.add(70);
		set.add("日");
		set.add(80);
		set.add("韓");
		set.add(65);
		System.out.println(set);
	}

}
