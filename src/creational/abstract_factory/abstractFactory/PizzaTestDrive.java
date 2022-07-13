package creational.abstract_factory.abstractFactory;

import creational.abstract_factory.abstractFactory.pizza.Pizza;
import creational.abstract_factory.abstractFactory.pizza_store.AbstractPizzaStore;
import creational.abstract_factory.abstractFactory.pizza_store.ChicagoPizzaStore;
import creational.abstract_factory.abstractFactory.pizza_store.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {

        AbstractPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");

        AbstractPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = nyPizzaStore.orderPizza("cheese");

    }
}
