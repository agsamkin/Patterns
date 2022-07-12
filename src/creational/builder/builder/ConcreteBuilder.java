package creational.builder.builder;

import creational.builder.house.Basement;
import creational.builder.house.House;
import creational.builder.house.Roof;
import creational.builder.house.Storey;

public class ConcreteBuilder extends Builder {

    House house = new House();

    @Override
    public void BuildBasement() {
        house.add(new Basement());
    }

    @Override
    public void BuildStorey() {
        house.add(new Storey());
    }

    @Override
    public void BuildRoof() {
        house.add(new Roof());
    }

    @Override
    public House getResult() {
        return house;
    }

}
