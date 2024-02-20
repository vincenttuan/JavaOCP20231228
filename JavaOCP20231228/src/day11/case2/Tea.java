package day11.case2;

public class Tea extends AbstractDrinkable implements Coffienated {

	@Override
	public Double getCoffienateContent() {
		// 每 200ml 是 5 g
		return getVolume() * (5/200.0); 
	}

}
