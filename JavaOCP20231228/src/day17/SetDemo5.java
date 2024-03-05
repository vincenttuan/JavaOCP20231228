package day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo5 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(100);
		set.add(null);
		set.add(80);
		set.add(null);
		set.add(90);
		System.out.println(set);
		// 請計算總分
		// 利用 Iterator 的 remove() 方法將 null 元素從集合中移除
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			if(iter.next() == null) {
				iter.remove(); // 移除元素
			}
		}
		System.out.println(set);
		
		int sum = set.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
