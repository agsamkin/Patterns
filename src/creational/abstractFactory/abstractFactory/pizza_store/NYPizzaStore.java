package creational.abstractFactory.abstractFactory.pizza_store;

import creational.abstractFactory.abstractFactory.pizza.Pizza;
import creational.abstractFactory.abstractFactory.pizza.ny_pizza.NYCheesePizza;
import creational.abstractFactory.abstractFactory.pizza.ny_pizza.NYPepperoniPizza;
import creational.abstractFactory.abstractFactory.pizza.ny_pizza.NYVeggiePizza;

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
