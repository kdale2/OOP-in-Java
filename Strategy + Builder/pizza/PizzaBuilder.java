package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements IPizzaBuilder {
	
    private String size;
    private List<String> toppings = new ArrayList<String>();

	@Override
    public void addTopping(String topping) {
		toppings.add(topping);	
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Pizza getPizza() {
    	Pizza pizza = new Pizza(size, toppings);
		return pizza;
    }
}
