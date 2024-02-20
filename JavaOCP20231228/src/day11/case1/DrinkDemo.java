package day11.case1;

public class DrinkDemo {
	public static void main(String[] args) {
		Milk milk = new Milk();
		milk.setName("厚厚鮮奶");
		milk.setVolume(250);
		milk.setCost(20);
		milk.setPrice(40);
		
		Latte latte = new Latte();
		latte.setName("拿鐵咖啡");
		latte.setVolume(300);
		latte.setCost(15);
		latte.setPrice(60);
		
		Espresso espresso = new Espresso();
		espresso.setName("義式濃縮");
		espresso.setVolume(150);
		espresso.setCost(25);
		espresso.setPrice(70);
		
		Juice juice = new Juice();
		juice.setName("柳丁原汁");
		juice.setVolume(500);
		juice.setCost(50);
		juice.setPrice(120);
		
		Tea tea = new Tea();
		tea.setName("烘焙烏龍");
		tea.setVolume(200);
		tea.setCost(2);
		tea.setPrice(15);
		
		printDrinkDetails(milk);
		printDrinkDetails(latte);
		printDrinkDetails(espresso);
		printDrinkDetails(juice);
		printDrinkDetails(tea);
	}
	
	private static void printDrinkDetails(Drinkable drink) {
		System.out.printf("飲品: %s 容量: %d 毫升 ", drink.getName(), drink.getVolume());
		System.out.printf("成本: %d 售價: %d 元 ", drink.getCost(), drink.getPrice());
		// 該飲品是否含有咖啡因
		if(drink instanceof Coffienated) {
			System.out.printf("咖啡因含量: %.2f 毫克", ((Coffienated)drink).getCoffienateContent());
		}
		System.out.println();
	}
	
}
