package day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {

	public static void main(String[] args) {
		// Java 5.0 加入泛型<>, 目的: 限制集合元素的型別
		//Set<Integer> set = new LinkedHashSet<Integer>(); // Java 7 以前
		Set<Integer> set = new LinkedHashSet<>(); // Java 7(含)以後, 若 實體的元素泛型與宣告的泛型一致, 則可以使用 <> <- 表示自動推斷
		set.add(100);
		set.add(80);
		set.add(90);
		// set.add("國文"); // 不可放, 因為有泛型的限制
		System.out.println(set);
		int sum = 0;
		for(Integer data : set) {
			sum += data;
		}
		System.out.println(sum);
		
		Iterator<Integer> iter = set.iterator(); // 集合內建的走訪器
		int sum2 = 0;
		while (iter.hasNext()) {
			sum2 += iter.next();
		}
		System.out.println(sum2);
		
		// 利用 java 8 stream
		int sum3 = set.stream().mapToInt(data -> data.intValue()).sum();
		System.out.println(sum3);
		
		int sum4 = set.stream().mapToInt(data -> data).sum(); // 利用 Java 5.0 autoUnboxing 的特性 (Integer 轉 int). data -> data.intValue() 
		System.out.println(sum4);
		
		int sum5 = set.stream().mapToInt(Integer::intValue).sum(); // 利用 Java 8 方法參考
		System.out.println(sum5);
		
		long sum6 = set.stream().mapToInt(Integer::intValue).summaryStatistics().getSum();
		System.out.println(sum6);

	}

}
