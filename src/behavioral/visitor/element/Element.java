package behavioral.visitor.element;

import behavioral.visitor.Visitor;

public abstract class Element {

    public abstract void accept(Visitor visitor);

}
