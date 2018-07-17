package observer002.v2.observer;

/**
 * Created by 40741 on 2018/7/16.
 * 观察者接口，它可以观察一个主题，并在主题改变时更新自己的数据。
 */
public interface Observer {
    /**
     * 更新数据
     */
    void update(float temp, float humidity, float pressure);
}
