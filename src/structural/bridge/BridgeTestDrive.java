package structural.bridge;

import structural.bridge.abstraction.Abstraction;
import structural.bridge.abstraction.RefinedAbstraction;
import structural.bridge.implemention.ConcreteImplementerA;
import structural.bridge.implemention.ConcreteImplementerB;

public class BridgeTestDrive {

    public static void main(String[] args) {

        Abstraction abstraction;

        abstraction = new RefinedAbstraction(new ConcreteImplementerA());
        abstraction.operation();

        abstraction = new RefinedAbstraction(new ConcreteImplementerB());
        abstraction.operation();


    }

}
