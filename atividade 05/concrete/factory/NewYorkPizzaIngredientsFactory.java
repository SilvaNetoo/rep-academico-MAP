package concrete.factory;

import concrete.ingredients.FrozenCheese;
import concrete.ingredients.FrozenChocolate;
import concrete.ingredients.FrozenPepperoni;
import concrete.ingredients.FrozenPortuguese;
import interfaces.factory.PizzaIngredientsFactory;
import interfaces.ingredients.Cheese;
import interfaces.ingredients.Chocolate;
import interfaces.ingredients.Pepperoni;
import interfaces.ingredients.Portuguese;

public class NewYorkPizzaIngredientsFactory implements PizzaIngredientsFactory{

	@Override
	public Cheese createCheese() {
		return new FrozenCheese();
	}

	@Override
	public Chocolate createChocolate() {
		return new FrozenChocolate();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new FrozenPepperoni();
	}

	@Override
	public Portuguese createPortuguese() {
		return new FrozenPortuguese();
	}

	@Override
	public String getInfo() {
		return "New York pizzas ";
	}

}
