package observer002.v2.observer.impl;

import observer002.v2.observer.DispalyElement;
import observer002.v2.observer.Observer;
import observer002.v2.subject.Subject;

/**
 * Created by 40741 on 2018/7/17.
 */
public class CurrentConditionDisplay implements Observer, DispalyElement {

    private float temperature;
    private float humidity;
    // 需要主题作注册用
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("实时布告板：当前温度：%.2f, 当前湿度：%.2f\n", temperature, humidity);
    }
}
