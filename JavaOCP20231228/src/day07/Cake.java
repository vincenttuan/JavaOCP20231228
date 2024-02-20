package day07;

public class Cake extends Food {
	private double size; // 尺寸

	public Cake() {
		
	}

	public Cake(double size) {
		this.size = size;
	}
	
	public Cake(String name, int price, double size) {
		super(name, price);
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cake [size=" + size + ", name=" + getName() + ", price=" + getPrice() + "]";
	}
	
	
	
}
