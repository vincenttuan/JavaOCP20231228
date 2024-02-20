package day07;

public class Test2 {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.setId(100);
		teacher1.setName("Helen");
		teacher1.setSex('女');
		teacher1.setSalary(60000);
		System.out.println(teacher1);
		
		Teacher teacher2 = new Teacher(80000);
		teacher2.setId(202);
		teacher2.setName("Rose");
		teacher2.setSex('女');
		System.out.println(teacher2);
		
		Teacher teacher3 = new Teacher(3, "Tom", '男', 90000);
		System.out.println(teacher3);
		
	}
}
