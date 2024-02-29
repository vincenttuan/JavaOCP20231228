package day16;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		// 國英數考試成績如下
		Set set = new LinkedHashSet();
		set.add("90"); // String
		set.add(100);  // Integer
		set.add("80"); // String
		System.out.println(set);
		// 請計算總分

	}

}
