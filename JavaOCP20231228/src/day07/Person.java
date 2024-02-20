package day07;

public class Person {
	private int id; // 編號
	private String name; // 姓名
	private char sex; // 性別(M, F)
	
	public Person() {
	
	}

	public Person(int id, String name, char sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
}
