package day12.case1;

import java.util.List;

public class ShopMain {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone("Google", "Pixel 6a");
		Smartphone smartphone2 = new Smartphone("Apple", "iPhone 15");
		SmartTV smartTV = new SmartTV("Samsung", "QLED 8K");
		
		smartphone.display();
		smartphone.sell();
		smartphone.recharge();
		smartphone.connectToWiFi("Tauyuan WiFi");
		
		smartphone2.display();
		smartphone2.sell();
		smartphone2.recharge();
		smartphone2.connectToWiFi("Taipei WiFi");
		
		smartTV.display();
		smartTV.sell();
		smartTV.connectToWiFi("Home WiFi");
		
		System.out.println("-----------------------------------------------");
		
		List<ElectronicProduct> electronicProducts = List.of(smartphone, smartphone2, smartTV);
		electronicProducts.forEach(product -> product.display());
		
		System.out.println("-----------------------------------------------");
		
		List<WiFiEnabled> wiFiEnableds = List.of(smartphone, smartphone2, smartTV);
		wiFiEnableds.forEach(wifi -> wifi.connectToWiFi("Home WiFi"));
		
		System.out.println("-----------------------------------------------");
		
		List<Rechargeable> rechargeables = List.of(smartphone, smartphone2);
		rechargeables.forEach(rechargeable -> rechargeable.recharge());
		
		
	}

}
