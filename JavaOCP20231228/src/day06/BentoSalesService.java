package day06;

/**
 * 便當銷售服務: 負責處理銷售操作並計算機會損失
 * */
public class BentoSalesService {
	
	// 預設準備 N 個便當
	private Bento[] bentos = {
			// 便當名稱, 價格, 初始庫存量, 補貨目標量
			new Bento("雞腿便當", 100, 50, 20),
			new Bento("素食便當", 80, 50, 20),
			new Bento("排骨便當", 90, 50, 20),
			new Bento("水果便當", 120, 50, 20),
			new Bento("打拋豬便當", 110, 50, 20),
	};
	
	// 取得指定便當方法
	public Bento getBentoByName(String name) {
		for(int i=0;i<bentos.length;i++) {
			if(bentos[i].getName().equals(name)) {
				return bentos[i]; 
			}
		}
		return null;
	}
	
	// 賣便當
	public void sellBento(String name, int amount) {
		// 找到指定便當
		Bento bento = getBentoByName(name);
		if(bento == null) {
			System.out.println("無此便當: " + name);
			return;
		}
		// 銷售便當
		int realAmount = bento.sell(amount);
		System.out.printf("要賣出 %s %d 個 實際賣出 %d 個 收入 $%,d%n", name, amount, realAmount, bento.getPrice() * realAmount);
	}
	
	// 計算機會損失
	public void calcOpportunityLoss(String name) {
		// 找到指定便當
		Bento bento = getBentoByName(name);
		// 計算機會損失
		int totalLoss = bento.getMissedSales() * bento.getPrice();
		System.out.printf("%s 的機會損失 $%,d%n", bento.getName(), totalLoss);
	}
	
	// 計算實際損失
	public void calcRealLoss(String name) {
		// 找到指定便當
		Bento bento = getBentoByName(name);
		// 計算實際損失
		int realLoss = bento.getQuantity() * bento.getPrice();
		System.out.printf("%s 的實際損失 $%,d%n", bento.getName(), realLoss);
	}
	
	// 捕貨檢查
	public void restock(String name) {
		int minAmount = 10;
		// 找到指定便當
		Bento bento = getBentoByName(name);
		int targetAmount = bento.getRestockTarget();
		if(bento.getQuantity() <= minAmount) {
			System.out.printf("要捕貨 %s 目前庫存: %d 補到 %d 個%n", name, bento.getQuantity(), targetAmount);
			bento.setQuantity(targetAmount);
		} else {
			System.out.printf("不捕貨 %s 目前庫存: %d%n", name, bento.getQuantity());
		}
	}
	
}
