package observer002.v2.subject.impl;

import observer002.v2.observer.Observer;
import observer002.v2.subject.Subject;

import java.util.ArrayList;

/**
 * Created by 40741 on 2018/7/16.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        // 获取温度，不用实现
        return temperature;
    }
    public float getHumidity() {
        // 获取湿度，不用实现
        return humidity;
    }
    public float getPressure() {
        // 获取气压，不用实现
        return pressure;
    }

    /**
     * 一旦数据更新，此方法会被调用
     */
    public void  measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    /**
     * 进行数据更新
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println("=== 数据开始更新... ===");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        System.out.println("=== 数据更新完毕 ===");
    }
}
