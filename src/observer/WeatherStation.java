package observer;

import observer.observer.AnotherDisplay;
import observer.observer.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);
        AnotherDisplay display2 = new AnotherDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 72, 29.2f);

    }

}
