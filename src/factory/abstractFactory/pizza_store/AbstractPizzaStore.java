package factory.abstractFactory.pizza_store;

import factory.abstractFactory.pizza.Pizza;

public abstract class AbstractPizzaStore {

    public Pizza orderPizza(String type) {
        return createPizza(type);
    }

    protected abstract Pizza createPizza(String type); // FactoryMethod

}
