package day11.case1;

public class Espresso implements Drinkable, Coffienated {

	private Integer price;  // 售價
	private Integer cost;   // 成本
	private String  name;   // 品名
	private Integer volume; // 容量
	
	@Override
	public Integer getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public Integer getCost() {
		return this.cost;
	}

	@Override
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Integer getVolume() {
		return volume;
	}

	@Override
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	@Override
	public Double getCoffienateContent() {
		// 每 200ml 是 35 g
		return getVolume() * (35/200.0); 
	}
 
}
 
