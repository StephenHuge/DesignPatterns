package factory004.v3.pizzastore.impl;

import factory004.pizza.Pizza;
import factory004.pizza.impl.*;
import factory004.v2.SimplePizzaFactory;
import factory004.v3.pizzastore.PizzaStore;

/**
 * Created by 40741 on 2018/7/23.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYPepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NYClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NYVeggiePizza();
        } else {
            pizza = new SimplePizza();
        }
        return pizza;
    }
}
