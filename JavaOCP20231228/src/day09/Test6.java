package day09;

public class Test6 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.job();
		((Manager)emp1).budget();
	}
}
