package decorator003.decorator;

import decorator003.component.Beverage;

/**
 * Created by 40741 on 2018/7/18.
 * 调料类，所有调料都需要实现此类。
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
