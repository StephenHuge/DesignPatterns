package decorator003.decorator.impl;

import decorator003.component.Beverage;
import decorator003.decorator.CondimentDecorator;

/**
 * Created by 40741 on 2018/7/18.
 * 牛奶配料。
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return 0.1 + this.beverage.cost();
    }
}
