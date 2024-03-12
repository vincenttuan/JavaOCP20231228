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
		
		Map<String, Long> result2 = fruits.stream().collect(
				Collectors.groupingBy(fruit -> fruit.getName(), Collectors.counting()));
		System.out.println(result2);
		
		Map<String, Long> result3 = fruits.stream().collect(
				Collectors.groupingBy(Fruit::getName, Collectors.counting()));
		System.out.println(result3);
		
		// 每種水果各有幾顆 ?
		Map<String, Integer> result4 = fruits.stream().collect(
				Collectors.groupingBy(Fruit::getName, Collectors.summingInt(fruit -> fruit.getQty())));
		System.out.println(result4);
		
		Map<String, Integer> result5 = fruits.stream().collect(
				Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty)));
		System.out.println(result5);
		
	}
}
