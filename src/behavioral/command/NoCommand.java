package behavioral.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no behavioral.command");
    }
}
