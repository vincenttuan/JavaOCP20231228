package day22;

public class Score {
	private String studentName;
	private Integer chinese;
	private Integer english;
	private Integer math;
	private Integer sum;
	private Double avg;
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
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Score [studentName=" + studentName + ", chinese=" + chinese + ", english=" + english + ", math=" + math
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	
	
}
