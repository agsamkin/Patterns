package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

public class Shop extends Colleague {

    public Shop(Mediator mediator) {
        super(mediator);
    }

    public void sellKetchup(String msg) {
        System.out.println(msg);
        System.out.println("Shop sold ketchup");
    }

}
