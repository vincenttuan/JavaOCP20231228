package day15;

public class LambdaDemo6 {
	public static void main(String[] args) {
		// 混用 Function, Predicate, Consumer
		String[] scores = {"100", "50", "70", "40", "90"};
		// 請印出及格的分數
		for(String str : scores) {
			// 1.字串轉換成(map)數字
			int score = Integer.parseInt(str);
			// 2.判斷過濾(filter)是否及格
			if(score >= 60) {
				// 3. 印出
				System.out.println(score);
			}
		}
		
		
		
	}
}
