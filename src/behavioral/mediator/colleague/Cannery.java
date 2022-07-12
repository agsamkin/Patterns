package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public class Cannery extends Colleague {

    public Cannery(Mediator mediator) {
        super(mediator);
    }

    public void makeKetchup(String msg) {
        System.out.println(msg);
        System.out.println("Cannery produced ketchup");
        mediator.send("ketchup", this);
    }

}
