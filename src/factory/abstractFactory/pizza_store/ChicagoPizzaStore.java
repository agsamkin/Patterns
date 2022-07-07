package factory.abstractFactory.pizza_store;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza.chicago_pizza.ChicagoCheesePizza;
import factory.abstractFactory.pizza.chicago_pizza.ChicagoPepperoniPizza;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }
        return pizza;
    }
}
