package day16;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
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
		
		// 印出元素內容與資料型別
		for(Object data : set) {
			System.out.println(data + ", " + data.getClass().getSimpleName());
		}
		System.out.println("-----------------");
		// 印出元素內容與Integer資料型別
		for(Object data : set) {
			if(data instanceof Integer) {
				System.out.println(data + ", " + data.getClass().getSimpleName());
			}
		}
		// 計算總分
		

	}

}
