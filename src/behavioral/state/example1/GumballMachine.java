package behavioral.state.example1;

import behavioral.state.example1.state.*;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State soldState;

    State state;
    int count;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count>0) {
            setState(noQuarterState);
        } else {
            setState(soldOutState);
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }


    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }
}
