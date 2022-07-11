package prototype;

import prototype.clones.ConcretePrototype1;
import prototype.clones.Prototype;

public class PrototypeTestDrive {

    public static void main(String[] args) {

        Prototype prototype1 = new ConcretePrototype1(1);
        Prototype clone1 = prototype1.clone();

        System.out.println(prototype1.getId());
        System.out.println(clone1.getId());

        Prototype prototype2 = new ConcretePrototype1(2);
        Prototype clone2 = prototype2.clone();

        System.out.println(prototype2.getId());
        System.out.println(clone2.getId());

    }

}
