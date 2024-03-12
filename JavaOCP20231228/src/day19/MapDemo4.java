package day19;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class MapDemo4 {
	public static void main(String[] args) {
		//List<String> fruits = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		List<String> fruits = List.of("apple", "apple", "banana", "apple", "orange", "banana", "papaya"); // 唯讀
		System.out.println(fruits);
		// 請問每一種水果個有幾個 ?
		/*
		Map<String, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(name -> {
					return name;
				}, Collectors.counting()));
		*/
		Map<String, Long> result = fruits.stream()
				.collect(groupingBy(Function.identity(), counting()));
		
		System.out.println(result);
		
		// 按照數量大->小排序
		Map<String, Long> sortedMap = new LinkedHashMap<>();
		result.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		System.out.println(sortedMap);
		
		
		
	}
}
