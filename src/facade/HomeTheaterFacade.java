package facade;

public class HomeTheaterFacade {

    DvdPlayer dvdPlayer;
    Projector projector;
    Lights lights;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Lights lights, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
    }

    public void on() {
        screen.down();
        dvdPlayer.on();
        projector.on();
        lights.off();
    }

    public void off() {
        lights.on();
        dvdPlayer.off();
        projector.off();
        screen.up();
    }

}
