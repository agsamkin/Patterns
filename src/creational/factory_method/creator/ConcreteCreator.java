package creational.factory_method.creator;

import creational.factory_method.product.ConcreteProduct;
import creational.factory_method.product.Product;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
