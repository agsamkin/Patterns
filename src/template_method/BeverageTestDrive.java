package template_method;

import template_method.beverage.CaffeineBeverage;
import template_method.beverage.Coffee;
import template_method.beverage.Tea;

public class BeverageTestDrive {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();

    }

}
