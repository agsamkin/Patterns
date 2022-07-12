package behavioral.state.example1;

public class Market {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }

}
