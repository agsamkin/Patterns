package behavioral.command.stereo;

public class Stereo {

    public void on() {
        System.out.println("Stereo on");
    }

    public void setCd(String cdName) {
        System.out.println("Set CD " + cdName);
    }

    public void setVolume(int volume) {
        System.out.println("Set volume " + volume);
    }

    public void off() {
        System.out.println("Stereo off");
    }

}
