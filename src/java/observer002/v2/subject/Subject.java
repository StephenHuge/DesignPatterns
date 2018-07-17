package observer002.v2.subject;

import observer002.v2.observer.Observer;

/**
 * Created by 40741 on 2018/7/16.
 * 主题接口，它可以有多个观察者。
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
