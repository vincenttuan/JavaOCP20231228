package day19;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo5 {
	public static void main(String[] args) {
		List<Fruit> fruits = List.of(
				new Fruit("apple",      10, 9),  // 一箱
				new Fruit("banana",     20, 19),  
				new Fruit("orange",     10, 29),
				new Fruit("watermelon", 10, 29),
				new Fruit("papaya",     20, 9),
				new Fruit("apple",      10, 9),
				new Fruit("banana",     10, 19),
				new Fruit("apple",      20, 9)
		);
		System.out.println(fruits);
		// 每種水果各有幾箱 ?
		Map<String, Long> result1 = fruits.stream().collect(
				Collectors.groupingBy(fruit -> {
					String name = fruit.getName();
					return name;
				}, Collectors.counting()));
		System.out.println(result1);
		
		
		
	}
}
