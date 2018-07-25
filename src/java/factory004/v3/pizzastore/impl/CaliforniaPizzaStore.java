package factory004.v3.pizzastore.impl;

import factory004.pizza.Pizza;
import factory004.pizza.impl.*;
import factory004.v2.SimplePizzaFactory;
import factory004.v3.pizzastore.PizzaStore;

/**
 * Created by 40741 on 2018/7/23.
 */
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CaliforniaCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new CaliforniaPepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new CaliforniaClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new CaliforniaVeggiePizza();
        } else {
            pizza = new SimplePizza();
        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
    }
}
