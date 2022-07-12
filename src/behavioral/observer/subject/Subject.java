package behavioral.observer.subject;

import behavioral.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
