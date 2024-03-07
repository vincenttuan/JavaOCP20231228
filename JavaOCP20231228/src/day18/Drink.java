package day18;

public class Drink {
	private String name;
	private Integer price;
	
	public Drink() {
		
	}
	
	public Drink(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return 7 * 17 * (name.hashCode() + price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Drink)) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		Drink drink = (Drink)obj;
		if(drink.name.equals(this.name) && drink.price.equals(this.price)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
