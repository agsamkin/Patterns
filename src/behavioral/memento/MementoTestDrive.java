package behavioral.memento;

public class MementoTestDrive {

    public static void main(String[] args) {

        Man man = new Man();
        Robot robot = new Robot();

        man.setClothes("футблока, джинсы, кеды");
        robot.setBackpack(man.undress());
        man.setClothes("шорты");
        man.dress(robot.getBackpack());

    }

}
