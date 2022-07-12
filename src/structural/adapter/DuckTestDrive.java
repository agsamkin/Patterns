package structural.adapter;

public class DuckTestDrive {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        Turkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();

    }

}
