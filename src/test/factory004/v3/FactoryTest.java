package factory004.v3;

import factory004.pizza.Pizza;
import factory004.v3.pizzastore.PizzaStore;
import factory004.v3.pizzastore.impl.ChicagoPizzaStore;
import factory004.v3.pizzastore.impl.NYPizzaStore;

/**
 * Created by 40741 on 2018/7/23.
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan点了一个" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel点了一个" + pizza.getName() + "\n");
    }
}
