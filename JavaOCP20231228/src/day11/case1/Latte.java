package day11.case1;

public class Latte extends Milk implements Coffienated {
	@Override
	public Double getCoffienateContent() {
		// 每 200ml 是 30 克
		return getVolume() * (30/200.0) ;
	}
}
 
