package day12.case2;

/*
 * 創建抽象員工類別：創建一個名為AbstractEmployee的抽象類別，實現Employee接口，
 * 並提供員工共有的屬性，如姓名、基本薪資、獎金，以及遲到扣薪的基本處理。
 * */
public abstract class AbstractEmployee implements Employee {
	protected String name; // 姓名
	protected int baseSalary; // 基本薪資
	protected int bonus; // 獎金
	protected int lateDays; // 遲到天數
	protected int lateDeduction; // 每天遲到扣薪金額
	
	public AbstractEmployee(String name, int baseSalary, int bonus, int lateDeduction) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.lateDeduction = lateDeduction;
		this.lateDays = 0; // 初始遲到天數
	}
	
	public void addLateDay() { // 增加遲到天數 +1
		lateDays++;
	}
	
	//@Override
	public int calculateSalary() {
		int salary = baseSalary + bonus - (lateDays * lateDeduction);
		return salary;
	}
	
}
