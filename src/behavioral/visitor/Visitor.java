package behavioral.visitor;

import behavioral.visitor.element.BoysHouse;
import behavioral.visitor.element.GirlsHouse;

public abstract class Visitor {

    public abstract void visitBoysHouse(BoysHouse boysHouse);
    public abstract void visitGirlsHouse(GirlsHouse girlsHouse);

}
