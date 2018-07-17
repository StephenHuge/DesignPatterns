package observer002.v2.observer;

/**
 * Created by 40741 on 2018/7/17.
 * 由于有的观察者并不需要展示所有数据，所以这个接口的作用是
 * 可以控制实现它的观察者只展示需要展示的数据。
 */
public interface DispalyElement {
    void display();
}
