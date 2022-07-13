package creational.factory_method.creator;

import creational.factory_method.product.Product;

public abstract class Creator {

    Product product;

    public abstract Product factoryMethod();

    public void anOperation() {
        product = factoryMethod();
    }

}
