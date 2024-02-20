package day09;

public class Test2 {

	public static void main(String[] args) {
		// 多型
		Employee emp1 = new Manager();
		emp1.job();
		//emp1.budget(); // 不可使用
	}

}
