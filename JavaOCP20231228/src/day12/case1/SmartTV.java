package day12.case1;

public class SmartTV extends BaseProduct implements WiFiEnabled {
 
	public SmartTV(String brand, String model) {
		super(brand, model);
	}
	 
	@Override
	public void sell() {
		System.out.printf("銷售智能電視 - %s %s%n", brand, model);
	}
	 
	@Override
	public void connectToWiFi(String network) {
		System.out.printf("智能電視連接到 WiFi 無線網路: %s%n", network);
	}
	 
}
 
