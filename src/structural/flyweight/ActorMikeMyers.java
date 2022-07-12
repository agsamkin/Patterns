package structural.flyweight;

public class ActorMikeMyers extends Flyweight {

    @Override
    public void greeting(String speech) {
        System.out.println(speech);
    }

}
