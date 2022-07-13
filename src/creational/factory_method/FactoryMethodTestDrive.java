package creational.factory_method;

import creational.factory_method.creator.ConcreteCreator;
import creational.factory_method.creator.Creator;
import creational.factory_method.product.Product;

public class FactoryMethodTestDrive {
    public static void main(String[] args) {

        Creator creator = null;
        Product product = null;

        creator = new ConcreteCreator();
        product = creator.factoryMethod();

        creator.anOperation();

    }
}
