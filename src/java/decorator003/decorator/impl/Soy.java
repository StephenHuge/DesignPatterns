package decorator003.decorator.impl;

import decorator003.component.Beverage;
import decorator003.decorator.CondimentDecorator;

/**
 * Created by 40741 on 2018/7/18.
 * 豆浆配料。
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }
}
