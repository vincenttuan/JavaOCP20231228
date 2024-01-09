package day04;

public class Student { // 學生類別
	String name; // 學生姓名(物件屬性/物件變數/物件欄位/物件成員/物件資產/物件狀態)
	int score;   // 學生成績(物件屬性/物件變數/物件欄位/物件成員/物件資產/物件狀態)
	int sex;     // 學生性別(物件屬性/物件變數/物件欄位/物件成員/物件資產/物件狀態)
	
	// 建構子(無參數)
	public Student() {
		System.out.println("呼叫無參數建構子");
		// 建立初始值
		this.name = "無名氏";
		this.score = -1;
		this.sex = -1;
	}
	
	// 建構子(有參數)
	public Student(String name, int score, int sex) {
		// 注入指定初始資訊
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return String.format("學生姓名: %s 成績: %d 性別: %d", 
				this.name, this.score, this.sex);
	}
	
}
