package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
