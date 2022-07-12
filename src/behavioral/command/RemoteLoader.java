package behavioral.command;

import behavioral.command.light.Light;
import behavioral.command.light.LightOffCommand;
import behavioral.command.light.LightOnCommand;
import behavioral.command.stereo.Stereo;
import behavioral.command.stereo.StereoOffCommand;
import behavioral.command.stereo.StereoOnCommand;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

    }

}
