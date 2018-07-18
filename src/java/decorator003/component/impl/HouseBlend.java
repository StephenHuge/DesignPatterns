package decorator003.component.impl;

import decorator003.component.Beverage;

/**
 * Created by 40741 on 2018/7/18.
 * 综合咖啡。
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("HouseBlend");
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
