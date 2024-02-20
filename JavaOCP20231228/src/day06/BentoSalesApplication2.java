package day06;

public class BentoSalesApplication2 {

	public static void main(String[] args) {
		// 雞腿便當(chickenBento)分別賣出 27, 15, 18
		// 素食便當(vegetarianBento)分別賣出 17, 23, 15
		// 請求出所有便當的機會損失 $
		
		BentoSalesService service = new BentoSalesService();
		
		int[] chickenBentoAmounts = {27, 15, 18};
		int[] vegetarianBentoAmounts = {17, 23, 15};
		
		String chickenBentoName = "雞腿便當";
		String vegetarianBentoName = "素食便當";
		
		// 售出雞腿便當
		for(int amount : chickenBentoAmounts) {
			service.sellBento(chickenBentoName, amount);
		}
		
		// 售出素食便當
		for(int amount : vegetarianBentoAmounts) {
			service.sellBento(vegetarianBentoName, amount);
		}
		
		// 計算指定便當機會損失
		service.calcOpportunityLoss(chickenBentoName);
		service.calcOpportunityLoss(vegetarianBentoName);
	}

}
