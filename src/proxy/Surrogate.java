package proxy;

public class Surrogate implements Human {

    Human operator;

    public Surrogate(Human operator) {
        this.operator = operator;
    }

    @Override
    public void request() {
        operator.request();
    }

}
