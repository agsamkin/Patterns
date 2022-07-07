package factory.abstractFactory;

import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza_store.AbstractPizzaStore;
import factory.abstractFactory.pizza_store.ChicagoPizzaStore;
import factory.abstractFactory.pizza_store.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {

        AbstractPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");

        AbstractPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = nyPizzaStore.orderPizza("cheese");

    }
}
