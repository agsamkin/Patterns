package structural.flyweight;

public class RoleDoctorEvil extends Flyweight {

    Flyweight flyweight;

    public RoleDoctorEvil(Flyweight flyweight) {
        this.flyweight = flyweight;
    }

    @Override
    public void greeting(String speech) {
        flyweight.greeting(speech);
    }

}
