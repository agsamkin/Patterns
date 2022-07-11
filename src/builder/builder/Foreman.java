package builder.builder;

public class Foreman {

    Builder builder;

    public Foreman(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.BuildBasement();
        builder.BuildStorey();
        builder.BuildRoof();
    }

}
