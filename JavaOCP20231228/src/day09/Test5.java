package day09;

public class Test5 {
	public static void main(String[] args) {
		Employee emp1 = new Manager();
		emp1.job();
		((Manager)emp1).job();
		((Employee)emp1).job();
		((Employee)(Employee)emp1).job();
		((Employee)(Manager)(Employee)emp1).job();
	}
}
