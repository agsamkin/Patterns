package creational.abstract_factory.simpleFactory;

import creational.abstract_factory.simpleFactory.pizza.CheesePizza;
import creational.abstract_factory.simpleFactory.pizza.PepperoniPizza;
import creational.abstract_factory.simpleFactory.pizza.Pizza;
import creational.abstract_factory.simpleFactory.pizza.VeggiePizza;

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
