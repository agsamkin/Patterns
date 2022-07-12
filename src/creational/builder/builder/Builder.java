package creational.builder.builder;

import creational.builder.house.House;

public abstract class Builder {

    public abstract void BuildBasement();

    public abstract void BuildStorey();

    public abstract void BuildRoof();

    public abstract House getResult();

}
