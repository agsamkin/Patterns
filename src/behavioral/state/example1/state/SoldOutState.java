package behavioral.state.example1.state;

import behavioral.state.example1.GumballMachine;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //
    }

    @Override
    public void ejectQuarter() {
        //
    }

    @Override
    public void turnCrank() {
        //
    }

    @Override
    public void dispense() {
        //
    }
}
