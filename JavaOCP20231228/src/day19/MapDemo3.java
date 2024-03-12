package day19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("英文", 90);
		exams.put("社會", 85);
		exams.put("自然", 30);
		exams.put("數學", 90);
		
		// 分類統計
		// 等級 數量
		//  A: 3
		//  B: 1
		//  C: 0
		//  D: 0
		//  F: 1
		
		//  等級型別  數量型別  
		Map<String, Long> gradeDistribution = exams.values().stream()
				.collect(Collectors.groupingBy(score -> {
					if(score >= 90) return "A";
					else if (score >= 80) return "B";
					else if (score >= 70) return "C";
					else if (score >= 60) return "D";
					else return "F";
				}, Collectors.counting()));
		
		System.out.println(gradeDistribution);
		
		// 分類統計
		// 等級  數量
		// 及格:  4
		// 不及格: 1
		
		
	}
}
