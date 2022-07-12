package behavioral.state.example2.developer;

import behavioral.state.example2.activity.Activity;
import behavioral.state.example2.activity.Coding;
import behavioral.state.example2.activity.Eating;
import behavioral.state.example2.activity.Sleeping;

public class Developer {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Coding) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Sleeping());
        } else {
            setActivity(new Coding());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }

}
