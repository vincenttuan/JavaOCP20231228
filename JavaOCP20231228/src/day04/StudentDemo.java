package day04;

public class StudentDemo {

	public static void main(String[] args) {
		// 建立一個學生物件
		Student student1 = new Student();
		// 配置/注入學生相關資訊
		student1.name = "John";
		student1.score = 80;
		student1.sex = 1;
		
		// 再建立一個學生物件
		Student student2 = new Student();
		// 配置/注入學生相關資訊
		student2.name = "Mary";
		student2.score = 70;
		student2.sex = 2;
		
		// 再建立一個學生物件
		Student student3 = new Student();
		
		// 再建立一個學生物件
		Student student4 = new Student("Rose", 90, 2);
		
		// 將學生資料呈現出來 I
		System.out.printf("學生姓名: %s 成績: %d 性別: %d%n", 
				student1.name, student1.score, student1.sex);
		
		System.out.printf("學生姓名: %s 成績: %d 性別: %d%n", 
				student2.name, student2.score, student2.sex);
		
		System.out.printf("學生姓名: %s 成績: %d 性別: %d%n", 
				student3.name, student3.score, student3.sex);
	
		System.out.printf("學生姓名: %s 成績: %d 性別: %d%n", 
				student4.name, student4.score, student4.sex);
		
		// 將學生資料呈現出來 II
		System.out.println(student1); // student1.toString();
		System.out.println(student2); // student2.toString();
		System.out.println(student3); // student3.toString();
		System.out.println(student4); // student4.toString();
		
	}

}
