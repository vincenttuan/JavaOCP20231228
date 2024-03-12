package day19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("英文", 90);
		exams.put("社會", 50);
		exams.put("自然", 30);
		exams.put("數學", 90);
		
		// 使用 BiConsumer 來自定義輸出格式
		BiConsumer<String, Integer> printExams1 = (subject, score) -> System.out.printf("科目:%s 成績:%d%n", subject, score); 
		BiConsumer<String, Integer> printExams2 = (subject, score) -> System.out.printf("%s, %d%n", subject, score); 
		
		// 印出所有考試成績
		exams.forEach(printExams1);
		exams.forEach(printExams2);
		
		// 請幫我印出平均分數(利用 exams.values())
		System.out.println("平均分數:");
		
		
	}
}
