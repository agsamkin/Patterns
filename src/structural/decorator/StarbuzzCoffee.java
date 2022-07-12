package structural.decorator;

import structural.decorator.beverage.Beverage;
import structural.decorator.beverage.DarkRoast;
import structural.decorator.beverage.Espresso;
import structural.decorator.condiment.Mocha;
import structural.decorator.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + ", cost " + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ", cost " + beverage2.cost());

    }

}
