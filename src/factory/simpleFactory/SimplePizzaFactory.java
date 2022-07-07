package factory.simpleFactory;

import factory.simpleFactory.pizza.CheesePizza;
import factory.simpleFactory.pizza.PepperoniPizza;
import factory.simpleFactory.pizza.Pizza;
import factory.simpleFactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
