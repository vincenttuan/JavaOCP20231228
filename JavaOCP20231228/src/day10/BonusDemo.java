package day10;

public class BonusDemo {

	public static void main(String[] args) {
		Bonus regularBonus = new RegularEmployeeBonus();
		int regularEmployeeBonus = regularBonus.calculateBonus(4_5000);
		System.out.printf("普通員工年終獎金 $%,d%n", regularEmployeeBonus);
		
		Bonus seniorBonus = new SeniorEmployeeBonus();
		int seniorEmployeeBonus = seniorBonus.calculateBonus(15_0000);
		System.out.printf("高級員工年終獎金 $%,d%n", seniorEmployeeBonus);
		
		Bonus managerBonus = new ManagementEmployeeBonus();
		int managementEmployeeBonus = managerBonus.calculateBonus(25_0000);
		System.out.printf("管理階層年終獎金 $%,d%n", managementEmployeeBonus);
		
		// PartTime 員工給 1.5 個月 (使用 Lambda)
		//Bonus partTimeBonus = (int salary) -> { return (int)(salary * 1.5);};
		//Bonus partTimeBonus = (salary) -> { return (int)(salary * 1.5);};
		//Bonus partTimeBonus = (salary) -> (int)(salary * 1.5);
		Bonus partTimeBonus = salary -> (int)(salary * 1.5);
		int partTimeEmployeeBonus = partTimeBonus.calculateBonus(2_0000);
		System.out.printf("計時人員年終獎金 $%,d%n", partTimeEmployeeBonus);
		
		// 發放紅包統一發放 8000 元
		Bonus redEnvelopeBonus = salary -> 8000;
		int redEnvelopeAmount = redEnvelopeBonus.calculateBonus(0);
		System.out.printf("紅包金額 $%,d%n", redEnvelopeAmount);
	}

}
