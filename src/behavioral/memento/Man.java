package behavioral.memento;

public class Man {

    private String clothes;

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public void dress(Backpack backpack) {
        clothes = backpack.getContent();
    }

    public Backpack undress() {
        return new Backpack(clothes);
    }

}
