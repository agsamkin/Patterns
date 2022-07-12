package behavioral.state.example2;

import behavioral.state.example2.activity.Coding;
import behavioral.state.example2.developer.Developer;

public class DeveloperDay {

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Coding());
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }

}
