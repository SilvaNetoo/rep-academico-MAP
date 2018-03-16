package interfaces.factory;

import interfaces.ingredients.Cheese;
import interfaces.ingredients.Chocolate;
import interfaces.ingredients.Pepperoni;
import interfaces.ingredients.Portuguese;

public interface PizzaIngredientsFactory {

	Cheese createCheese();
	
	Chocolate createChocolate();
	
	Pepperoni createPepperoni();
	
	Portuguese createPortuguese();
	
	String getInfo();
}
