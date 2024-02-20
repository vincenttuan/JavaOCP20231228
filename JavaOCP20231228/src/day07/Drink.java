package day07;

public class Drink extends Food {
	private boolean hot;

	public Drink() {
		
	}

	public Drink(boolean hot) {
		this.hot = hot;
	}
	
	public Drink(String name, int price, boolean hot) {
		super(name, price);
		this.hot = hot;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

	@Override
	public String toString() {
		return "Drink [hot=" + hot + ", name=" + getName() + ", price=" + getPrice() + "]";
	}

	
	
	
}
