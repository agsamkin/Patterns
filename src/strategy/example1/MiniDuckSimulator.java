package strategy.example1;

import strategy.example1.duck.Duck;
import strategy.example1.duck.MallardDuck;
import strategy.example1.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("\n");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

    }
}
