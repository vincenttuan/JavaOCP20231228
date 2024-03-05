package day17;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo6 {

	public static void main(String[] args) {
		Student s1 = new Student("John", 'M', 80);
		Student s2 = new Student("Mary", 'F', 90);
		Student s3 = new Student("Bobo", 'M', 100);
		Student s4 = new Student("Jack", 'M', 70);
		Student s5 = new Student("Rose", 'F', 95);
		
		Set<Student> students = new LinkedHashSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		System.out.println(students);
		
		// 請計算出全班總成績與男女各別的總成績
		
	}

}
