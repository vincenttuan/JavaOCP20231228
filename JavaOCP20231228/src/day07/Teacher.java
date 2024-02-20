package day07;

public class Teacher extends Person {
	private int salary; // 薪資

	public Teacher() {
		
	}

	public Teacher(int salary) {
		this.salary = salary;
	}
	
	public Teacher(int id, String name, char sex, int salary) {
		super(id, name, sex);
		/*
		super.setId(id);
		super.setName(name);
		super.setSex(sex);
		*/
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Teacher id: %d, name: %s sex: %c salary: %d%n", 
				getId(), getName(), getSex(), getSalary());
	}
	
}
