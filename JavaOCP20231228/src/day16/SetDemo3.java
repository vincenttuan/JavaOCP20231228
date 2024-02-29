package day16;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		// 國英數考試成績如下
		Set set = new LinkedHashSet();
		set.add("90"); // String
		set.add(100);  // Integer
		set.add(null);
		set.add("80"); // String
		System.out.println(set);
		// 請計算總分
		int total = 0;
		for(Object data : set) {
			if(data instanceof String) {
				total += Integer.parseInt(data.toString());
			} else if(data instanceof Integer) {
				total += (Integer)data; //相當於 total += ((Integer)data).intValue();
			}
		}
		System.out.println(total);
		
		// 請計算總分-使用 stream (暴力法)
		int total2 = set.stream().mapToInt(data -> Integer.parseInt(data + "")).sum();
		System.out.println(total2);
	}

}
