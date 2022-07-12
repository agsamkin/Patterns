package behavioral.observer.observer;

import behavioral.observer.subject.Subject;

public class AnotherDisplay implements Observer, DisplayElement {

    Subject weatherData;

    private float temperature;

    public AnotherDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Another conditions: " + temperature + "F");
    }

}
