package day18;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo8 {

	public static void main(String[] args) {
		// 有一系列的飲料
		Set<Drink> drinks = new LinkedHashSet<>();
		drinks.add(new Drink("Coffee", 65));
		drinks.add(new Drink("Tea", 20));
		drinks.add(new Drink("Milk", 50));
		drinks.add(new Drink("Cola", 25));
		drinks.add(new Drink("Cola", 25));
		drinks.add(new Drink("Beer", 70));
		drinks.add(new Drink("Beer", 70));
		drinks.add(new Drink("Yakult", 10));
		drinks.add(new Drink("Juice", 45));
		
		// 請問此系列有幾種飲料 ?
		System.out.printf("系列有幾種飲料: %d%n", drinks.size());
		
		// 列出此系列所有飲料 ?
		System.out.println(drinks);
		
	}

}
