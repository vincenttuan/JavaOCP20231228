package day22;

public class Score {
	private String studentName;
	private Integer chinese;
	private Integer english;
	private Integer math;
	private Integer summary;
	private Double average;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getChinese() {
		return chinese;
	}
	public void setChinese(Integer chinese) {
		this.chinese = chinese;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getSummary() {
		return summary;
	}
	public void setSummary(Integer summary) {
		this.summary = summary;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "Score [studentName=" + studentName + ", chinese=" + chinese + ", english=" + english + ", math=" + math
				+ ", summary=" + summary + ", average=" + average + "]";
	}
	
	
}
