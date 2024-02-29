package day16;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;

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
		int total = 0;
		for(Object data : set) {
			if(data instanceof Integer) {
				total += (Integer)data;
			}
		}
		System.out.println("總分:" + total);
		// 計算總分 使用 stream
		// [國, 100, 英, 70, 日, 80, 韓, 65] Object 串流
		// 過濾元素 Integer
		// [100, 70, 80, 65] // Object 串流
		// 轉換元素 int
		// [100, 70, 80, 65] // int 串流
		
		int total2 = set.stream() // [國, 100, 英, 70, 日, 80, 韓, 65] Object(String+Integer) 串流
						.filter(data -> data instanceof Integer) // [100, 70, 80, 65] // Object(Integer) 串流
						.mapToInt(data -> Integer.parseInt(data.toString()))
						.sum();
		System.out.println("總分:" + total2);   
		   
		int total3 = set.stream() // [國, 100, 英, 70, 日, 80, 韓, 65] Object(String+Integer) 串流
						.filter(data -> data instanceof Integer) // [100, 70, 80, 65] // Object(Integer) 串流
						//.mapToInt(data -> ((Integer)data).intValue()) // int 串流
						.mapToInt(data -> (Integer)data) // int 串流
						.sum();
		System.out.println("總分:" + total3);
		
	}

}
