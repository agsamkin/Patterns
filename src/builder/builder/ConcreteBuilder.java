package builder.builder;

import builder.house.Basement;
import builder.house.House;
import builder.house.Roof;
import builder.house.Storey;

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
