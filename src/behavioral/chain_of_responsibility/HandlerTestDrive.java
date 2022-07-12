package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handler.ConcreteHandler1;
import behavioral.chain_of_responsibility.handler.ConcreteHandler2;
import behavioral.chain_of_responsibility.handler.Handler;

public class HandlerTestDrive {
    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);

        handler1.handleRequest(1);
        handler1.handleRequest(2);

    }
}
