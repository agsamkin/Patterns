package behavioral.visitor.element;

import behavioral.visitor.Visitor;

public class GirlsHouse extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGirlsHouse(this);
    }

    public void giveDress() {
        System.out.println("Dress as a gift");
    }

}
