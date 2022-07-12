package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Colleague;

public abstract class Mediator {
    public abstract void send(String msg, Colleague colleague);
}
