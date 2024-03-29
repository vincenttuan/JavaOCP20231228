package day17;

import java.util.LinkedHashSet;
import java.util.Set;

/**
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、63、64(公斤)
比較二者的分散程度哪一個分散程度大 ?
 * */

public class SetDemo7 {

	public static void main(String[] args) {
		Set<Double> heights = new LinkedHashSet<>();
		heights.add(172.0);heights.add(168.0);heights.add(164.0);heights.add(170.0);heights.add(176.0);
		Set<Double> weights = new LinkedHashSet<>();
		weights.add(62.0);weights.add(57.0);weights.add(58.0);weights.add(63.0);weights.add(64.0);
		System.out.println(heights);
		System.out.println(weights);
		double heightCV = getCV(heights);
		double weightCV = getCV(weights);
		System.out.printf("身高的變異係數: %.3f%n", heightCV);
		System.out.printf("體重的變異係數: %.3f%n", weightCV);
		// 哪一個分散程度大
		String result = heightCV > weightCV ? "身高" : "體重";
		System.out.printf("%s 分散程度大%n", result);
	}
	
	// 取得平均
	private static double getAvg(Set<Double> values) {
		//double avg = values.stream().mapToDouble(value -> value.doubleValue()).average().getAsDouble(); 
		double avg = values.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		return avg;
	}
	
	// 取得標準差
	private static double getSD(Set<Double> values) {
		int n = values.size();
		double avg = getAvg(values);
		double sum = values.stream().mapToDouble(value -> Math.pow(value - avg, 2)).sum();
		double sd = Math.sqrt(sum / n);
		return sd;
	}
	
	// 取得變異係數
	private static double getCV(Set<Double> values) {
		double sd = getSD(values);
		double avg = getAvg(values);
		double cv = sd / avg;
		return cv;
	}
	

}
