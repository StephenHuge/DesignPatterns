package decorator003.component.impl;

import decorator003.component.Beverage;

/**
 * Created by 40741 on 2018/7/18.
 * 深焙咖啡。
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("DarkRoast");
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
