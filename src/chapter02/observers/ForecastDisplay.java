package chapter02.observers;

import chapter02.subjects.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); //주제에 옵저버 등록
    }
    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println(currentPressure);
    }
}
