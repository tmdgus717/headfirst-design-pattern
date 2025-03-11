package chapter02;

import chapter02.observers.CurrentConditionDisplay;
import chapter02.observers.ForecastDisplay;
import chapter02.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(90,65,40.4f);
        weatherData.setMeasurements(100,65,50.4f);
    }
}
