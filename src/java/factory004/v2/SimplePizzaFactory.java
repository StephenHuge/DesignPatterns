package factory004.v2;

import factory004.pizza.Pizza;
import factory004.pizza.impl.CheesePizza;
import factory004.pizza.impl.GreekPizza;
import factory004.pizza.impl.PepperoniPizza;
import factory004.pizza.impl.SimplePizza;

/**
 * Created by 40741 on 2018/7/23.
 * 本类也被称为简单工厂模式。
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new SimplePizza();
        }
        return pizza;
    }
}
