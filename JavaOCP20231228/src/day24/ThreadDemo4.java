package day24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// 利用 Runnable 來創建執行緒工作
		Runnable job1 = () -> { // 顯示現在日期與時間
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
			System.out.println("現在時刻: " + sdf.format(new Date()));
		};
		
		Runnable job2 = () -> { // 取得一個幸運數字
			Random random = new Random();
			System.out.println("幸運數字: " + random.nextInt(100));
		};
		
		Runnable job3 = () -> { // 取得台積電股價
			System.out.println("台積電股價: 750");
		};
		
		
	}

}
