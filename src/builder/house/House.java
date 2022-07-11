package builder.house;

import java.util.ArrayList;

public class House {

    ArrayList<PartHouse> parts = new ArrayList();

    public void add(PartHouse partHouse) {
        parts.add(partHouse);
    }

}
