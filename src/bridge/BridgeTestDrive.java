package bridge;

import bridge.abstraction.Abstraction;
import bridge.abstraction.RefinedAbstraction;
import bridge.implemention.ConcreteImplementerA;
import bridge.implemention.ConcreteImplementerB;

public class BridgeTestDrive {

    public static void main(String[] args) {

        Abstraction abstraction;

        abstraction = new RefinedAbstraction(new ConcreteImplementerA());
        abstraction.operation();

        abstraction = new RefinedAbstraction(new ConcreteImplementerB());
        abstraction.operation();


    }

}
