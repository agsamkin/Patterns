package prototype.clones;

public abstract class Prototype {

    protected int id;

    public Prototype(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract Prototype clone();

}
