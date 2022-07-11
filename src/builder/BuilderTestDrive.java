package builder;

import builder.builder.Builder;
import builder.builder.ConcreteBuilder;
import builder.builder.Foreman;
import builder.house.House;

public class BuilderTestDrive {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);
        foreman.construct();

        House house = builder.getResult();

    }

}
