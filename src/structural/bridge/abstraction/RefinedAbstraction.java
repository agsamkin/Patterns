package structural.bridge.abstraction;

import structural.bridge.implemention.Implementer;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementer implementer) {
        super(implementer);
    }

    @Override
    public void operation() {
        System.out.println("before");
        super.operation();
        System.out.println("after");
    }
}
