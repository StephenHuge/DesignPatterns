package decorator003.component.impl;

import decorator003.component.Beverage;

/**
 * Created by 40741 on 2018/7/18.
 * 浓缩咖啡。
 */
public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
