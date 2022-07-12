package behavioral.command.stereo;

import behavioral.command.Command;

public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("Metallica");
        stereo.setVolume(12);
    }

}
