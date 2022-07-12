package structural.flyweight;

public class FlyweightTestDrive {

    public static void main(String[] args) {

        Flyweight actorMikeMyers = new ActorMikeMyers();

        Flyweight roleAustinPowers = new RoleAustinPowers(actorMikeMyers);
        roleAustinPowers.greeting("Hello! I`m Austin Powers");

        Flyweight roleDoctorEvil = new RoleDoctorEvil(actorMikeMyers);
        roleDoctorEvil.greeting("Hello! I`m Dr. Evil");


    }

}
