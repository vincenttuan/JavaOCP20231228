package day06;

public class BentoSalesApplication {

	public static void main(String[] args) {
		BentoSalesService service = new BentoSalesService();
		
		String name = "雞腿便當";
		int amount = 20;
		
		// 查看指定便當庫存
		System.out.println(service.getBentoByName(name));
		
		// 1. 賣出指定便當
		service.sellBento(name, amount);
		// 1. 查看指定便當庫存
		System.out.println(service.getBentoByName(name));
		
		// 2. 賣出指定便當
		service.sellBento(name, amount);
		// 2. 查看指定便當庫存
		System.out.println(service.getBentoByName(name));
		
		// 3. 賣出指定便當
		service.sellBento(name, amount);
		// 3. 查看指定便當庫存
		System.out.println(service.getBentoByName(name));
		
		// 4. 賣出指定便當
		service.sellBento(name, amount);
		// 4. 查看指定便當庫存
		System.out.println(service.getBentoByName(name));
				
		// 計算指定便當機會損失
		service.calcOpportunityLoss(name);
	}

}
