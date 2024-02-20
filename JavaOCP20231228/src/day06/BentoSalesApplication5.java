package day06;

public class BentoSalesApplication5 {

	public static void main(String[] args) {
		// 雞腿便當(chickenBento)分別賣出 27, 15, 18
		// 素食便當(vegetarianBento)分別賣出 17, 23, 15
		// 排骨便當(vegetarianBento)分別賣出 10, 5, 8, 14, 17
		// 請求出所有便當的機會損失 $
		
		BentoSalesService service = new BentoSalesService();
		
		String[] bentoNames = {"雞腿便當", "素食便當", "排骨便當"};
		int[][] bentoAmounts = {{27, 15, 18}, {17, 23, 15}, {10, 5, 8, 14, 17}};
		
		double count = 0.0;
		int totalAmount = 0;
		for(int[] bentoAmount : bentoAmounts) {
			for(int amount : bentoAmount) {
				totalAmount += amount;
				count++;
			}
		}
		System.out.printf("平均每次交易的便當數量: %.1f%n", (totalAmount/count));
		
		//String[] bentoNames = {"雞腿便當"};
		//int[][] bentoAmounts = {{27, 15, 18}};
		
		// 售出便當&補貨檢查
		for(int i=0;i<bentoNames.length;i++) {
			// 售出便當
			processSales(service, bentoNames[i], bentoAmounts[i]);
		}
		
		// 計算指定便當機會損失
		for(int i=0;i<bentoNames.length;i++) {
			service.calcOpportunityLoss(bentoNames[i]);
		}
		
		// 計算指定便當實際損失
		for(int i=0;i<bentoNames.length;i++) {
			service.calcRealLoss(bentoNames[i]);
		}
		
	}
	
	// 售出便當的統一方法
	public static void processSales(BentoSalesService service, String bentoName, int[] amounts) {
		for(int amount : amounts) {
			service.sellBento(bentoName, amount);
			// 捕貨檢查
			service.restock(bentoName);
		}
	}

}
