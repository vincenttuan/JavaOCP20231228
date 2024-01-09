package day04;

import java.util.Arrays;

public class StudentDemo2 {

	public static void main(String[] args) {
		Student student1 = new Student("John", 80, 1);
		Student student2 = new Student("Mary", 70, 2);
		Student student3 = new Student("Jack", 90, 1);
		Student student4 = new Student("Rose", 50, 2);
		Student student5 = new Student("Anna", 43, 2);
		
		Student[] students = {student1, student2, student3, student4, student5};
		// 資料呈現
		// 自動呼叫每一個陣列元素(student物件)的toString()物件方法
		System.out.println(Arrays.toString(students)); 
		// 利用 for-loop 將資料呈現
		for(int i=0;i<students.length;i++) {
			System.out.println(i + " => " + students[i]);
		}
		// 利用 for-each/for-in 將資料呈現
		for(Student student : students) {
			System.out.println(student);
		}
		// 利用 java 8 stream 串流的 forEach() 簡化寫法 I
		Arrays.stream(students).forEach(student -> System.out.println(student));
		// 利用 java 8 stream 串流的 forEach() + :: 方法參考 簡化寫法 II
		Arrays.stream(students).forEach(System.out::println);
	}

}
