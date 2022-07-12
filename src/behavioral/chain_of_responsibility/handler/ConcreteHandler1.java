package behavioral.chain_of_responsibility.handler;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 1) {
            System.out.println("One");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
