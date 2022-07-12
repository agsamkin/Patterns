package behavioral.state.example1.state;

import behavioral.state.example1.GumballMachine;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please, wait, we`re already given you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned twice doesn`t get you another gumball");
    }

    @Override
    public void dispense() {
        //
    }
}
