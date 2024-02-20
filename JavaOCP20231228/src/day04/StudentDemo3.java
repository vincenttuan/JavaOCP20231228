package day04;

import java.util.Arrays;

public class StudentDemo3 {
	public static void main(String[] args) {
		Student student1 = new Student("John", 80, 1);
		Student student2 = new Student("Mary", 70, 2);
		Student student3 = new Student("Jack", 90, 1);
		Student student4 = new Student("Rose", 50, 2);
		Student student5 = new Student("Anna", 43, 2);
		
		Student[] students = {student1, student2, student3, student4, student5};
		System.out.println("未加分之前: " + Arrays.toString(students));
		// 及格的要 +5 分
		/*
		for(int i=0;i<students.length;i++) {
			if(students[i].score >= 60) {
				students[i].score += 5; // students[i].score = students[i].score + 5;
			}
		}
		*/
		/*
		for(Student student : students) {
			if(student.score >= 60) {
				student.score += 5;
			}
		}
		*/
		Arrays.stream(students)
				.filter(student -> student.score >= 60)
				.forEach(student -> student.score += 5);
		
		System.out.println("有加分之後: " + Arrays.toString(students));
	}
}
