package day13;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car() {
			public void print() {
				System.out.println("BYD");
			}
			
			public void speed() {
				System.out.println("280 km/h");
			}
		};
		
		car.print();
		car.speed();

	}

}
