package day23;

public class RaceDemo {

	public static void main(String[] args) {
		Race tortoise = new Race();
		Race rabbit = new Race();
		tortoise.setName("烏龜");
		rabbit.setName("兔子");
		System.out.println("比賽開始");
		
		tortoise.start();
		rabbit.start();

	}

}
