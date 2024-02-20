package day14;

public class FamilyTest {

	public static void main(String[] args) {
		Family family = new Family("Jack");
		Family.Child child1 = family.new Child("John");
		Family.Child child2 = family.new Child("Mary");
		child1.selfIntroduction();
		child2.selfIntroduction();
		
		family.buyCar("BMW SUV");
		
		family.familyDay();
		
		Family.Love love = new Family.Love();
		love.printMessage();
		
	}

}
