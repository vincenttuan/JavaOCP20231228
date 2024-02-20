package day06;

/**
 * 便當類
 * 包含: 名稱, 價格, 庫存數量, 紀錄未能銷售的數量, 補貨目標量
 * */

public class Bento {
	private String name; // 便當名稱
	private int price; // 便當價格
	private int quantity; // 庫存數量
	private int missedSales; // 未能銷售的數量
	private int restockTarget; // 補貨目標量
	
	public Bento(String name, int price, int quantity, int restockTarget) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.missedSales = 0;
		this.restockTarget = restockTarget;
	}
	
	// 賣便當
	public int sell(int amount) {
		int realAmount = amount; // 實際要賣出的數量
		if(amount > quantity) {
			missedSales += amount - quantity;
			realAmount = quantity; // 實際賣出的數量 = 庫存量
			quantity = 0;
		} else {
			quantity -= amount;
		}
		return realAmount; // 實際賣出數量
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMissedSales() {
		return missedSales;
	}

	public void setMissedSales(int missedSales) {
		this.missedSales = missedSales;
	}

	public int getRestockTarget() {
		return restockTarget;
	}

	public void setRestockTarget(int restockTarget) {
		this.restockTarget = restockTarget;
	}

	@Override
	public String toString() {
		return "Bento [name=" + name + ", price=" + price + ", quantity=" + quantity + ", missedSales=" + missedSales
				+ ", restockTarget=" + restockTarget + "]";
	}
	
}
