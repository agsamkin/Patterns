package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Cannery;
import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.colleague.Farmer;
import behavioral.mediator.colleague.Shop;

public class ConcreteMediator extends Mediator {

    public Farmer farmer;
    public Cannery cannery;
    public Shop shop;

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public Cannery getCannery() {
        return cannery;
    }

    public void setCannery(Cannery cannery) {
        this.cannery = cannery;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague instanceof Farmer) {
            cannery.makeKetchup(msg);
        } else if (colleague instanceof Cannery) {
            shop.sellKetchup(msg);
        }
    }

}
