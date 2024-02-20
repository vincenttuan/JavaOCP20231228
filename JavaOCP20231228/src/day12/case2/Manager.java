package day12.case2;

/*
 * 經理：創建一個名為Manager的類別，繼承自AbstractEmployee，並添加額外獎金的屬性和處理。
 * */
public class Manager extends AbstractEmployee {
	private double extraBonus; // 經理額外的獎金
	
	public Manager(String name, int baseSalary, int bonus, int lateDeduction, int extraBonus) {
		super(name, baseSalary, bonus, lateDeduction);
		this.extraBonus = extraBonus;
	}

	//@Override
	public int calculateSalary() {
		int salary = super.calculateSalary(); // 不含額外的獎金 
		salary += extraBonus; // 加上額外的獎金
		return salary;
	}
	
	// Manager 若有必要可以在此加入額外的方法或屬性
}
