package observer002.v2.observer.impl;

import observer002.v2.observer.DispalyElement;
import observer002.v2.observer.Observer;
import observer002.v2.subject.Subject;

/**
 * Created by 40741 on 2018/7/17.
 */
public class StatisticsDisplay implements Observer, DispalyElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("统计布告板：平均温度：%.2f, 平均湿度：%.2f, 平均气压：%.2f\n", temperature, humidity, pressure);
    }
}
