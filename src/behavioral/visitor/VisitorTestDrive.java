package behavioral.visitor;

import behavioral.visitor.element.BoysHouse;
import behavioral.visitor.element.Element;
import behavioral.visitor.element.GirlsHouse;

public class VisitorTestDrive {
    public static void main(String[] args) {

        Village village = new Village();
        village.add(new BoysHouse());
        village.add(new GirlsHouse());

        village.accept(new Santa());

    }
}
