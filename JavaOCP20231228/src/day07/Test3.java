package day07;

public class Test3 {

	public static void main(String[] args) {
		Drink drink1 = new Drink("紅茶", 20, true); // true: 熱, false: 冷
		Drink drink2 = new Drink("珍珠奶茶", 35, false);
		Drink drink3 = new Drink("美式咖啡", 40, true);
		
		Cake cake1 = new Cake("巧克力蛋糕", 50, 3.5);
		Cake cake2 = new Cake("水果蛋糕", 70, 4); // 4.0
		Cake cake3 = new Cake("起司蛋糕", 60, 2.5);
		
		// 點餐(飲料)
		Drink[] drinks = {drink2, drink3, drink1, drink1, drink3, drink2};
		// 請問總共點了幾杯, 一共多少錢?
		int drinkAmounts = drinks.length;
		int drinkTotalPrice = 0;
		for(int i=0;i<drinks.length;i++) {
			Drink drink = drinks[i]; // 得到每一杯飲料
			drinkTotalPrice += drink.getPrice(); // 得到飲料的價格並累加到 drinkTotalPrice 變數中
		}
		System.out.printf("飲料: %d 杯 總價: $%d%n", drinkAmounts, drinkTotalPrice);
		
		// 點餐(蛋糕)
		Cake[] cakes = {cake1, cake3, cake2, cake2, cake3, cake1, cake3, cake2, cake1, cake1, cake2, cake3};
		// 請問總共點了幾個, 一共多少錢?
		int cakeAmounts = cakes.length;
		int cakeTotalPrice = 0;
		for(Cake cake : cakes) {
			cakeTotalPrice += cake.getPrice();
		}
		System.out.printf("蛋糕: %d 個 總價: $%d%n", cakeAmounts, cakeTotalPrice);
		
		int total = drinkTotalPrice + cakeTotalPrice;
		System.out.printf("總共花費: $%d%n", total);
	}

}
