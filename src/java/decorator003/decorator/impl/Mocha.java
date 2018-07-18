package decorator003.decorator.impl;

import decorator003.component.Beverage;
import decorator003.decorator.CondimentDecorator;

/**
 * Created by 40741 on 2018/7/18.
 * 摩卡，一种巧克力配料。
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        return 0.2 + this.beverage.cost();
    }
}
