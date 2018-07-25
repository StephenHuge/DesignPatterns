package factory004.pizza.impl;

import factory004.pizza.Pizza;

/**
 * Created by 40741 on 2018/7/23.
 */
public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "纽约风味酱料的奶酪披萨";
        dough = "薄地壳比萨生面团";
        sauce = "番茄大蒜调味汁";

        toppings.add("帕尔玛奶酪碎末");
    }
}
