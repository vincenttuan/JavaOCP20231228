package day07;

public class Student extends Person {
	private int score; // 考試成績
	
	public Student() {

	}
	
	public Student(int score) {
		this.score = score;
	}
	
	public Student(int id, String name, char sex, int score) {
		super.setId(id);
		super.setName(name);
		super.setSex(sex);
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("Student id: %d, name: %s sex: %c score: %d%n", 
				getId(), getName(), getSex(), getScore());
	}
}
