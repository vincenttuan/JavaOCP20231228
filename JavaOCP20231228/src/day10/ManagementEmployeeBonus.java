package day10;

// 管理階層年終獎金計算規則
// 計算規則 = 高級員工年終獎金規格的 x 3 倍
public class ManagementEmployeeBonus implements Bonus {
	private SeniorEmployeeBonus seniorEmployeeBonus;
	
	public ManagementEmployeeBonus() {
		this.seniorEmployeeBonus = new SeniorEmployeeBonus();
	}
	
	@Override
	public int calculateBonus(int salary) {
		int seniorBonus = seniorEmployeeBonus.calculateBonus(salary);
		int managerBonus = seniorBonus * 3;
		return managerBonus;
	}

}
