package day09;

public class Test8 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Manager mgr1 = new Manager();
		Manager mgr2 = new Manager();
		
		Employee[] employees = {emp1, emp2, mgr1, mgr2};
		// 請計算平均與總薪資
		int totalSalary = 0;
		for(Employee emp : employees) {
			totalSalary += emp.getSalary();
		}
		int averageSalary = totalSalary / employees.length;
		System.out.printf("總薪資: %,d 平均薪資: %,d%n", totalSalary, averageSalary);
		
		// 請計算 bonus 的總和 = ?
		int totalBonus = 0;
		for(Employee emp : employees) {
			if(emp instanceof Manager) {
				totalBonus += ((Manager)emp).getBunus();
			}
		}
		System.out.printf("總獎金: %,d%n", totalBonus);
		
		
	}

}
