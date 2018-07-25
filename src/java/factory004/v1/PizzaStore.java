package factory004.v1;

import factory004.pizza.Pizza;
import factory004.pizza.impl.CheesePizza;
import factory004.pizza.impl.GreekPizza;
import factory004.pizza.impl.PepperoniPizza;
import factory004.pizza.impl.SimplePizza;

/**
 * Created by 40741 on 2018/7/23.
 * 披萨店v1。
 * 缺点：如果需要增减pizza的种类，必须直接修改代码。
 * 原则：代码应该对扩展开放，对修改关闭。
 */
public class PizzaStore {
    public Pizza orderPizza(String type) {
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

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.orderPizza("cheese");
        store.orderPizza("greek");
    }
}
