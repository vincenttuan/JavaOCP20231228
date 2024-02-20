package day10;

public class CalcDemo {

	public static void main(String[] args) {
		Calc calc = new CalcImpl();
		calc.addElement(100);
		calc.addElement(-50);
		calc.addElement(80);
		calc.addElement(-30);
		calc.addElement(-20);
		calc.addElement(70);
		
		System.out.println(calc.getSize());
		System.out.println(calc.findAll());
		
		calc.updateElement(0, 99);
		System.out.println(calc.findAll());
		
		calc.deleteElement(0);
		System.out.println(calc.findAll());
		
		calc.deleteAllElements();
		System.out.println(calc.findAll());
		
	}

}
