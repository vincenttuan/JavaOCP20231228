package day23;

public class Race extends Thread {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 起跑%n", tName);
		for(int i=1;i<=5000;i++) {
			System.out.printf("%s 跑了 %d 公尺%n", tName, i);
		}
		System.out.printf("%s 跑到終點了%n", tName);
	}
	
}
