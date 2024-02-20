package day09;

public class Manager extends Employee {
	public int salary = 80000;
	private int bonus = 50000;
	@Override
	public int getSalary() {
		return salary;
	}
	
	@Override
	public void job() {
		System.out.println("我是經理-我做管理工作");
	}
	
	public void budget() {
		System.out.println("我是經理-要編列部門預算");
	}
	
	public int getBunus() {
		return bonus;
	}
	
}
