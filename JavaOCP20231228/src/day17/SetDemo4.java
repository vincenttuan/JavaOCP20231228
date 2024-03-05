package day17;

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
		
		
		

	}

}
