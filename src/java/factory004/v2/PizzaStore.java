package factory004.v2;

import factory004.pizza.Pizza;

/**
 * Created by 40741 on 2018/7/23.
 * 披萨店v2。
 * 相对于v1的区别：将制造pizza的过程放入到SimplePizzaFactory中，
 * 使得创建代码和orderPizza()方法分离。
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
    }
}
