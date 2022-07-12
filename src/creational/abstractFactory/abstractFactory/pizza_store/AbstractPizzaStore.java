package creational.abstractFactory.abstractFactory.pizza_store;

import creational.abstractFactory.abstractFactory.pizza.Pizza;

public abstract class AbstractPizzaStore {

    public Pizza orderPizza(String type) {
        return createPizza(type);
    }

    protected abstract Pizza createPizza(String type); // FactoryMethod

}
