package day19;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo1 {
	
	public static void main(String[] args) {
		/*
		 * 
		 * {["國文", 100], ["英文", 90], ["數學", 90]}
		 * 
		 * */
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("英文", 90);
		exams.put("社會", 50);
		exams.put("自然", 30);
		exams.put("數學", 90);
		
		System.out.println(exams);
		System.out.println(exams.get("國文")); // O(1)
		System.out.println(exams.get("英文")); // O(1)
		System.out.println(exams.get("數學")); // O(1)
		System.out.println(exams.get("社會")); // O(1)
		
		// 取得所有的 keys
		Set<String> keys = exams.keySet();
		System.out.println(keys); // Set 集合
		Collection<Integer> values = exams.values(); 
		System.out.println(values); // Collection/List 集合
		
		// 印出元素
		exams.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("---------------");
		exams.entrySet().stream().filter(entry -> entry.getValue() >= 60).forEach(entry -> System.out.println(entry));
		System.out.println("---------------");
		exams.entrySet().stream().filter(entry -> entry.getValue() < 60).forEach(entry -> System.out.println(entry));
	}
	
}
