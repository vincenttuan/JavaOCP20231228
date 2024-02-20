package day12.case2;

/*
 * 普通員工：創建一個名為Staff的類別，繼承自AbstractEmployee。
 * */
public class Staff extends AbstractEmployee {

	public Staff(String name, int baseSalary, int bonus, int lateDeduction) {
		super(name, baseSalary, bonus, lateDeduction);
	}
	
	// Staff 若有必要可以在此加入額外的方法或屬性
}
