package program;

import java.util.ArrayList;
import java.util.List;


import model.Pizza;




public class PizzaListOhjelma {
	public static void main (String[] args) {
		Pizza pizza0 = new Pizza (10.00, 1, "Kinkku, Ananas, Aurajuusto", "Otto" );
		Pizza pizza1 = new Pizza (11.50, 2, "Pekoni, Kebab, Sipuli, Herkkusieni", "Bbq");
	
	List<Pizza> pizzat = new ArrayList<Pizza>();
	pizzat.add(pizza0);
	pizzat.add(pizza1);
	
	System.out.println(pizzat);
	for (Pizza pizza : pizzat) {
		System.out.println(pizza.getHinta() + "€ "+ pizza.getId()+ " "+ pizza.getKuvaus()+ " " +pizza.getNimi());}
	}

}
