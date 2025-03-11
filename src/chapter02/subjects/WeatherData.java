package chapter02.subjects;

import chapter02.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer); //옵저버 등록
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //==모든 옵저버에게 상태 변화를 알려주는 부분!!==//
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
//            observer.update(temperature, humidity, pressure);
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    } //기상 스테이션으로부터 데이터를 가져오는  메서드

    //==getter==//

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
