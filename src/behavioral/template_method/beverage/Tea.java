package behavioral.template_method.beverage;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
