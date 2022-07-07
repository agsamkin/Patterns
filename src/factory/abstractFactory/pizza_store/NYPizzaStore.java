package factory.abstractFactory.pizza_store;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza.ny_pizza.NYCheesePizza;
import factory.abstractFactory.pizza.ny_pizza.NYPepperoniPizza;
import factory.abstractFactory.pizza.ny_pizza.NYVeggiePizza;

public class NYPizzaStore extends AbstractPizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
