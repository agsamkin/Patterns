package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public class Farmer extends Colleague {

    public Farmer(Mediator mediator) {
        super(mediator);
    }

    public void growTomato() {
        System.out.println("Farmer raised tomato");
        mediator.send("tomato", this);
    }

}
