package program;

import java.util.HashMap;
import java.util.Map;

import model.Pizza;

public class PizzaMapOhjelma {

	public static void main(String[] args) {
		
		Pizza pizza0 = new Pizza (10.00, 1, "Kinkku, Ananas, Aurajuusto", "Otto" );
		Pizza pizza1 = new Pizza (11.50, 2, "Pekoni, Kebab, Sipuli, Herkkusieni", "Bbq");
		Pizza pizza2 = new Pizza (11.50, 3, "Pekoni, Kana, Sipuli, Herkkusieni", "ChickenBBQ");
		
		Map<Integer,Pizza> pizzat = new HashMap<Integer, Pizza>();
		pizzat.put(0, pizza0);
		pizzat.put(1, pizza1);
		pizzat.put(2, pizza2);
		
		
		System.out.println(pizzat.get(1));

	}

}
