package decorator003.component.impl;

import decorator003.component.Beverage;

/**
 * Created by 40741 on 2018/7/18.
 * 去咖啡因咖啡。
 */
public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf");
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
