import java.util.ArrayList;

import concrete.factory.ChicagoPizzaIngredientsFactory;
import concrete.factory.NewYorkPizzaIngredientsFactory;
import interfaces.factory.PizzaIngredientsFactory;

public class App {

	public static void main(String[] args) {
		
		ArrayList<PizzaIngredientsFactory> piz = getArrayDoUniversoAleatorio();
		for (PizzaIngredientsFactory p: piz) {
			System.out.println(p.getClass().getName());
			System.out.println(p.createCheese().getClass().getName());
			System.out.println(p.createChocolate().getClass().getName());
			System.out.println(p.createPepperoni().getClass().getName());
			System.out.println(p.createPortuguese().getClass().getName());
		}

	}

	private static ArrayList<PizzaIngredientsFactory> getArrayDoUniversoAleatorio() {
		ArrayList<PizzaIngredientsFactory> piz = new ArrayList<PizzaIngredientsFactory>();
		piz.add(new ChicagoPizzaIngredientsFactory());
		piz.add(new NewYorkPizzaIngredientsFactory());
		return piz;
	}

}
