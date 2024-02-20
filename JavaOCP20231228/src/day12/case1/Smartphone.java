package day12.case1;

public class Smartphone extends BaseProduct implements Rechargeable, WiFiEnabled {
 
	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	@Override
	public void sell() {
		System.out.printf("銷售手機 - %s %s%n", brand, model);
	}
	
	@Override
	public void recharge() {
		System.out.println("支援無線充電");
	}
	 
	@Override
	public void connectToWiFi(String network) {
		System.out.printf("智慧手機連接到 WiFi 無線網路: %s%n", network);
	}
	 
}
 
