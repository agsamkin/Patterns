package behavioral.template_method;

import behavioral.template_method.beverage.CaffeineBeverage;
import behavioral.template_method.beverage.Coffee;
import behavioral.template_method.beverage.Tea;

public class BeverageTestDrive {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();

    }

}
