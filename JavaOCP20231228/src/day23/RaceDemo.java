package day23;

public class RaceDemo {

	public static void main(String[] args) {
		Race tortoise = new Race();
		Race rabbit = new Race();
		// 設定名字
		tortoise.setName("烏龜");
		rabbit.setName("兔子");
		// 設定權限
		tortoise.setPriority(10);
		rabbit.setPriority(1);
		
		System.out.println("比賽開始");
		
		tortoise.start();
		rabbit.start();

	}

}
