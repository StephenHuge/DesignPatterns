package factory004.v4;

import factory004.v4.pizzav4.Pizza;

/**
 * Created by 40741 on 2018/7/25.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
