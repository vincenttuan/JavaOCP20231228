package day19;

import java.util.LinkedHashMap;
import java.util.Map;

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
		exams.put("數學", 90);
		System.out.println(exams);
		
	}
	
}
