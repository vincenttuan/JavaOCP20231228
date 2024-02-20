package day09;

public class Test7 {

	public static void main(String[] args) {
		Employee manger = new Manager();
		System.out.println(manger.getSalary());
		System.out.println(((Employee)manger).getSalary());
		System.out.println(((Manager)manger).getSalary());
		System.out.println();
		System.out.println(manger.salary);
		System.out.println(((Employee)manger).salary);
		System.out.println(((Manager)manger).salary);
	}

}
