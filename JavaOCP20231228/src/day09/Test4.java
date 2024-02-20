package day09;

public class Test4 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Manager mgr1 = new Manager();
		Manager mgr2 = new Manager();
		
		Employee[] employees = {mgr1, mgr2, emp1};
		for(Employee emp : employees) {
			emp.job();
			// 利用 instanceof 運算子來判斷 emp 是否可以轉型 Manager
			if(emp instanceof Manager) {
				((Manager)emp).budget(); // 強迫轉型
			}
		}
		
	}

}
