package behavioral.chain_of_responsibility.handler;

public abstract class Handler {

    public Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);

}
