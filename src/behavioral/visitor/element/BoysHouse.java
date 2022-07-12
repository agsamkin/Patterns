package behavioral.visitor.element;

import behavioral.visitor.Visitor;

public class BoysHouse extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBoysHouse(this);
    }

    public void tellFairyTale() {
        System.out.println("Fairy tale");
    }

}
