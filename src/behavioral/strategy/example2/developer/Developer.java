package behavioral.strategy.example2.developer;

import behavioral.strategy.example2.activity.Activity;

public class Developer {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }

}
