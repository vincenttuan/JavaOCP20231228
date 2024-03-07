package day18;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo9 {

	public static void main(String[] args) {
		// 排序(預設 小->大)
		Set<Integer> set = new TreeSet<>();
		set.add(90);
		set.add(100);
		set.add(80);
		System.out.println(set);
		
		// 有一系列的飲料
		Drink.SORT = 1;
		Set<Drink> drinks = new TreeSet<>();
		drinks.add(new Drink("Coffee", 65));
		drinks.add(new Drink("Tea", 20));
		drinks.add(new Drink("Milk", 50));
		drinks.add(new Drink("Cola", 25));
		drinks.add(new Drink("Cola", 25));
		drinks.add(new Drink("Beer", 70));
		drinks.add(new Drink("Beer", 70));
		drinks.add(new Drink("Yakult", 10));
		drinks.add(new Drink("Juice", 45));
		System.out.println(drinks);
	}

}
