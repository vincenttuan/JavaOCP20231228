package day12.case2;

public class Company {

	public static void main(String[] args) {
		Staff staff = new Staff("John", 55000, 15000, 2000);
		Manager manager = new Manager("Boss", 15_0000, 30000, 100, 90000);
		
		staff.addLateDay(); // 員工遲到一天
		staff.addLateDay(); // 員工遲到一天
		
		manager.addLateDay(); // 經理遲到一天
		
		System.out.printf("%s 的薪資 $%,d%n", staff.name, staff.calculateSalary());
		System.out.printf("%s 的薪資 $%,d%n", manager.name, manager.calculateSalary());
		
	}

}
