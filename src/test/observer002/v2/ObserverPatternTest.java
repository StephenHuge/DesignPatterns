package observer002.v2;

import observer002.v2.observer.Observer;
import observer002.v2.observer.impl.CurrentConditionDisplay;
import observer002.v2.observer.impl.ForcastDisplay;
import observer002.v2.observer.impl.StatisticsDisplay;
import observer002.v2.subject.impl.WeatherData;

/**
 * Created by 40741 on 2018/7/17.
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        // 气象站
        WeatherData weatherData = new WeatherData();
        // 3个布告板，默认已经注册
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer forcastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurements(1.2f, 2.3f, 2.5f);

        weatherData.removeObserver(forcastDisplay);
        System.out.println("预测布告板因预算原因移除...，重新更新数据");
        weatherData.setMeasurements(1.7f, 3.1f, 0.0f);

    }
}
