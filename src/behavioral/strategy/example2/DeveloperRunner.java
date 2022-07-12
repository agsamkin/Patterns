package behavioral.strategy.example2;

import behavioral.strategy.example2.activity.Cating;
import behavioral.strategy.example2.activity.Coding;
import behavioral.strategy.example2.activity.Sleeping;
import behavioral.strategy.example2.developer.Developer;

public class DeveloperRunner {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Cating());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

    }

}
