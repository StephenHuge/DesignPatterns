package decorator003.decorator.impl;

import decorator003.component.Beverage;
import decorator003.decorator.CondimentDecorator;

/**
 * Created by 40741 on 2018/7/18.
 * 奶泡配料。
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 0.1 + this.beverage.cost();
    }
}
