package factory.simpleFactory;

import factory.simpleFactory.pizza.Pizza;

public class SimplePizzaStore {

    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return factory.createPizza(type);
    }
}
