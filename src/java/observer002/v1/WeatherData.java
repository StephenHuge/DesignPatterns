package observer002.v1;

import observer002.v1.board.impl.CurrentConditionBoard;
import observer002.v1.board.impl.ForecastBoard;
import observer002.v1.board.impl.StatisticsBoard;

/**
 * Created by 40741 on 2018/7/16.
 */
public class WeatherData {

    private CurrentConditionBoard currentConditionBoard;

    private StatisticsBoard statisticsBoard;

    private ForecastBoard forecastBoard;

    public float getTemperature() {
        // 获取温度，不用实现
        return -1;
    }
    public float getHumidity() {
        // 获取湿度，不用实现
        return -1;
    }
    public float getPressure() {
        // 获取气压，不用实现
        return -1;
    }

    /**
     * 一旦数据更新，此方法会被调用
     * 需要实现的方法
     */
    public void  measurementsChanged() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // 最简单的实现 v1
        currentConditionBoard.update(temp, humidity, pressure);
        statisticsBoard.update(temp, humidity, pressure);
        forecastBoard.update(temp, humidity, pressure);
    }
}
