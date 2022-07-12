package structural.proxy;

public class SurrogateTestDrive {

    public static void main(String[] args) {

        Human bruce = new Operator();
        Human surrogate = new Surrogate(bruce);
        surrogate.request();

    }

}
