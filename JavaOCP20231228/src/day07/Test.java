package day07;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student();
		// 方法注入資訊
		student1.setId(1);
		student1.setName("John");
		student1.setSex('男');
		student1.setScore(90);
		System.out.println(student1);
		
		Student student2 = new Student(80); // 建構子注入
		// 方法注入資訊
		student2.setId(2);
		student2.setName("Mary");
		student2.setSex('女');
		System.out.println(student2);
		
		Student student3 = new Student(3, "Jack", '男', 59); // 建構子注入
		System.out.println(student3); // 可以得到: Student id: 3, name: Jack sex: 男 score: 59
	}

}

