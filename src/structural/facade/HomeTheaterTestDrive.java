package structural.facade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, lights, screen);
        homeTheaterFacade.on();
        homeTheaterFacade.off();

    }

}
