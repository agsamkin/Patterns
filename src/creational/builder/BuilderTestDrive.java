package creational.builder;

import creational.builder.builder.Builder;
import creational.builder.builder.ConcreteBuilder;
import creational.builder.builder.Foreman;
import creational.builder.house.House;

public class BuilderTestDrive {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);
        foreman.construct();

        House house = builder.getResult();

    }

}
