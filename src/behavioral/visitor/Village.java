package behavioral.visitor;

import behavioral.visitor.element.Element;

import java.util.ArrayList;

public class Village {

    ArrayList<Element> village = new ArrayList<>();

    public void add(Element element) {
        village.add(element);
    }

    public void remove(Element element) {
        village.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : village) {
            element.accept(visitor);
        }
    }

}
