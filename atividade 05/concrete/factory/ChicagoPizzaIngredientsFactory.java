package concrete.factory;

import concrete.ingredients.FreshCheese;
import concrete.ingredients.FreshChocolate;
import concrete.ingredients.FreshPepperoni;
import concrete.ingredients.FreshPortuguese;
import interfaces.factory.PizzaIngredientsFactory;
import interfaces.ingredients.Cheese;
import interfaces.ingredients.Chocolate;
import interfaces.ingredients.Pepperoni;
import interfaces.ingredients.Portuguese;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory {

	@Override
	public Cheese createCheese() {
		return new FreshCheese();
	}

	@Override
	public Chocolate createChocolate() {
		return new FreshChocolate();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new FreshPepperoni();
	}

	@Override
	public Portuguese createPortuguese() {
		return new FreshPortuguese();
	}

	@Override
	public String getInfo() {
		return "Chicago pizzas ";
	}
	
	

}
