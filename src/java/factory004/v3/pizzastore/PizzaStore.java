package factory004.v3.pizzastore;

import factory004.pizza.Pizza;
import factory004.v2.SimplePizzaFactory;

/**
 * Created by 40741 on 2018/7/23.
 * 披萨店v3。
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
