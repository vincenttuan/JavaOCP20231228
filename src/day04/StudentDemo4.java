package day04;

public class StudentDemo4 {
	public static void main(String[] args) {
		Student student1 = new Student("John", 80, 1);
		Student student2 = new Student("Mary", 70, 2);
		Student student3 = new Student("Jack", 90, 1);
		Student student4 = new Student("Rose", 50, 2);
		Student student5 = new Student("Anna", 43, 2);
		
		Student[] students = {student1, student2, student3, student4, student5};
		// 請將最高分與最低分的人名與分數列出
		// 利用替換法
		// 假設最高分的學生是 students[0]
		Student hightScoreStudent = students[0];
		for(int i=1;i<students.length;i++) {
			if(students[i].score > hightScoreStudent.score) {
				hightScoreStudent = students[i];
			}
		}
		System.out.printf("最高分: %d 姓名: %s%n", hightScoreStudent.score, hightScoreStudent.name);
		
		
	}
}
