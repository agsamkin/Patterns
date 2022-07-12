package behavioral.visitor;

import behavioral.visitor.element.BoysHouse;
import behavioral.visitor.element.GirlsHouse;

public class Santa extends Visitor {

    @Override
    public void visitBoysHouse(BoysHouse boysHouse) {
        boysHouse.tellFairyTale();
    }

    @Override
    public void visitGirlsHouse(GirlsHouse girlsHouse) {
        girlsHouse.giveDress();
    }

}
