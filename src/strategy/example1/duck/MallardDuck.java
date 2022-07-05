package strategy.example1.duck;

import strategy.example1.fly.FlyWithWings;
import strategy.example1.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m real mallard duck");
    }

}
