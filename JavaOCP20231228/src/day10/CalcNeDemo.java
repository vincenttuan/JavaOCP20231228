package day10;

public class CalcNeDemo {

	public static void main(String[] args) {
		Calc calc = new CalcNeImpl();
		calc.addElement(-10);
		calc.addElement(10);
		calc.addElement(-20);
		calc.addElement(20);
		calc.addElement(-30);
		calc.addElement(-50);
		System.out.println(calc.getSize());
		System.out.println(calc.findAll());
		// 再新增
		calc.addElement(-15);
		calc.addElement(-25);
		calc.addElement(-35);
		System.out.println(calc.getSize());
		System.out.println(calc.findAll());
		// 修改
		calc.updateElement(0, 10);
		System.out.println(calc.findAll());
		// 刪除
		calc.deleteElement(0);
		System.out.println(calc.findAll());
		// 刪除全部
		calc.deleteAllElements();
		System.out.println(calc.findAll());
		
	}

}

