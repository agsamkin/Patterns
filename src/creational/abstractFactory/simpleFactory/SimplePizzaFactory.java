package creational.abstractFactory.simpleFactory;

import creational.abstractFactory.simpleFactory.pizza.CheesePizza;
import creational.abstractFactory.simpleFactory.pizza.PepperoniPizza;
import creational.abstractFactory.simpleFactory.pizza.Pizza;
import creational.abstractFactory.simpleFactory.pizza.VeggiePizza;

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
