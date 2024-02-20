package day06;

public class BentoSalesApplication4 {

	public static void main(String[] args) {
		// 雞腿便當(chickenBento)分別賣出 27, 15, 18
		// 素食便當(vegetarianBento)分別賣出 17, 23, 15
		// 請求出所有便當的機會損失 $
		
		BentoSalesService service = new BentoSalesService();
		
		String[] bentoNames = {"雞腿便當", "素食便當"};
		int[][] bentoAmounts = {{27, 15, 18}, {17, 23, 15}};
		
		// 售出便當
		for(int i=0;i<bentoNames.length;i++) {
			processSales(service, bentoNames[i], bentoAmounts[i]);
		}
		
		// 計算指定便當機會損失
		for(int i=0;i<bentoNames.length;i++) {
			service.calcOpportunityLoss(bentoNames[i]);
		}
		
	}
	
	// 售出便當的統一方法
	public static void processSales(BentoSalesService service, String bentoName, int[] amounts) {
		for(int amount : amounts) {
			service.sellBento(bentoName, amount);
		}
	}

}
