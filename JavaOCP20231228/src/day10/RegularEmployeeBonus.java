package day10;

// 普通員工年終獎金計算規則
public class RegularEmployeeBonus implements Bonus {

	@Override
	public int calculateBonus(int salary) {
		return salary * 2; // 2 個月
	}
	
}
