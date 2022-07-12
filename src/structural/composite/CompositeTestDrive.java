package structural.composite;

import structural.composite.component.Component;
import structural.composite.component.Composite;
import structural.composite.component.Leaf;

public class CompositeTestDrive {

    public static void main(String[] args) {

        Component root = new Composite("root");

        Component brunch1 = new Composite("brunch1");
        Component brunch2 = new Composite("brunch2");

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");

        root.add(brunch1);
        brunch1.add(leaf1);

        root.add(brunch2);
        brunch2.add(leaf2);

    }

}
