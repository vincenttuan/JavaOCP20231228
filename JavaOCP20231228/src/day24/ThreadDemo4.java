package day24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// 利用 Runnable 來創建執行緒工作
		Runnable job1 = () -> { // 顯示現在日期與時間
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S E");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.S E");
			System.out.println("現在時刻: " + sdf.format(new Date()));
		};
		
		Runnable job2 = () -> { // 取得一個幸運數字
			Random random = new Random();
			System.out.println("幸運數字: " + random.nextInt(100));
		};
		
		Runnable job3 = () -> { // 取得台積電股價
			System.out.println("台積電股價: 750");
		};
		
		Thread t1 = new Thread(job1); // 建立一個 t1 執行緒來做 job1 的工作
		Thread t2 = new Thread(job2); // 建立一個 t2 執行緒來做 job2 的工作
		Thread t3 = new Thread(job3); // 建立一個 t3 執行緒來做 job3 的工作
		Thread t4 = new Thread(job1); // 建立一個 t4 執行緒來做 job1 的工作
		Thread t5 = new Thread(job2); // 建立一個 t5 執行緒來做 job2 的工作
		
		List<Thread> threads = List.of(t1, t2, t3, t4, t5);
		threads.forEach(t -> t.start());
		
	}

}
