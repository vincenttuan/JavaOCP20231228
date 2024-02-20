package day11.case2;

public class Espresso extends AbstractDrinkable implements Coffienated {

	@Override
	public Double getCoffienateContent() {
		// 每 200ml 是 35 g
		return getVolume() * (35/200.0); 
	}
 
}
 
