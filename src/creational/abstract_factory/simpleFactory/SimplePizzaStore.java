package creational.abstract_factory.simpleFactory;

import creational.abstract_factory.simpleFactory.pizza.Pizza;

public class SimplePizzaStore {

    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return factory.createPizza(type);
    }
}
