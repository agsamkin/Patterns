package bridge.abstraction;

import bridge.implemention.Implementer;

public abstract class Abstraction {

    protected Implementer implementer;

    public Abstraction(Implementer implementer) {
        this.implementer = implementer;
    }

    public void operation() {
        implementer.operation();
    }

}
