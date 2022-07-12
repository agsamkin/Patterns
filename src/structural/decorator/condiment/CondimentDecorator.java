package structural.decorator.condiment;

import structural.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
