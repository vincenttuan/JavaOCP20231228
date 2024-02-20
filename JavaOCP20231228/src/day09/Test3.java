package day09;

public class Test3 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Manager mgr1 = new Manager();
		Manager mgr2 = new Manager();
		
		Employee[] employees = {emp1, emp2, mgr1, mgr2};
		for(Employee emp : employees) {
			emp.job();
		}
		
		Manager[] managers = {mgr1, mgr2};
		for(Manager mgr : managers) {
			mgr.job();
			mgr.budget();
		}
		
	}

}
