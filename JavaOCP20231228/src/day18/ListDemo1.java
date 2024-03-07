package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(1, 80); // 指定插入位置
		list.add(90);
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext()) {
			int idx = iter.nextIndex();
			Integer value = iter.next();
			System.out.printf("%d: %d%n", idx, value);
		}
	}
}
