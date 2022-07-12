package behavioral.chain_of_responsibility.handler;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request == 2) {
            System.out.println("Two");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
