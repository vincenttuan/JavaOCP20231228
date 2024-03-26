package day23;

public class RaceDemo {

	public static void main(String[] args) {
		Race turtle = new Race();
		Race rabbit = new Race();
		turtle.setName("烏龜");
		rabbit.setName("兔子");
		System.out.println("比賽開始");
		
		turtle.start();
		rabbit.start();

	}

}
