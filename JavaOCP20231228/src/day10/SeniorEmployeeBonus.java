package day10;

// 高級員工年終獎金計算規則
public class SeniorEmployeeBonus implements Bonus {

	@Override
	public int calculateBonus(int salary) {
		return salary * 6; // 6 個月
	}
	
}
