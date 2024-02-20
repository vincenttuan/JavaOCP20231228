package day12.case1;

public abstract class BaseProduct implements ElectronicProduct {
 
	protected String brand; // 品牌
	protected String model; // 型號
	 
	public BaseProduct(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	@Override
	public void display() {
		System.out.printf("品牌: %s 型號: %s%n", brand, model);
	}
	 
}
 
