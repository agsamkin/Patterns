package structural.flyweight;

public class RoleAustinPowers extends Flyweight {

    Flyweight flyweight;

    public RoleAustinPowers(Flyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public void greeting(String speech) {
        flyweight.greeting(speech);
    }

}
