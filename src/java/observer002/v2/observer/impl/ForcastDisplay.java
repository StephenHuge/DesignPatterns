package observer002.v2.observer.impl;

import observer002.v2.observer.Observer;
import observer002.v2.subject.Subject;
import observer002.v2.observer.DispalyElement;

/**
 * Created by 40741 on 2018/7/17.
 */
public class ForcastDisplay implements Observer, DispalyElement {

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public ForcastDisplay(Subject weatherData) {
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
        System.out.printf("预测布告板：未来温度：%.2f, 未来湿度：%.2f\n", temperature, humidity);
    }
}
