package day14;

public class FormTest {

	public static void main(String[] args) {
		// From
		Form form = new Form();
		
		// Form.ButtonA
		Form.ButtonA buttonA = form.new ButtonA();
		buttonA.onClick();
		buttonA.onClick();
		 
		// Form.ButtonB
		Form.ButtonB buttonB = form.new ButtonB();
		buttonB.onClick();
		buttonB.onClick();
		
		Form.ButtonC buttonC = new Form.ButtonC();
		buttonC.displayCount(); 
	}

}
