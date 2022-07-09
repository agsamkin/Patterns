package template_method.beverage;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dropping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
