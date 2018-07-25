package factory004.pizza.impl;

import factory004.pizza.Pizza;

/**
 * Created by 40741 on 2018/7/23.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = " 芝加哥风味酱料的奶酪披萨";
        dough = "超厚皮比萨生面团";
        sauce = "圣女果调味汁";

        toppings.add("意大利白干酪");
    }
    public void cut() {
        System.out.println("切成正方形...");
    }
}
