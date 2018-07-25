package factory004.v4;

import factory004.v4.ingredient.PizzaIngredientFactory;
import factory004.v4.ingredient.impl.NYPizzaIngedientFactory;
import factory004.v4.pizzav4.CheesePizza;
import factory004.v4.pizzav4.ClamPizza;
import factory004.v4.pizzav4.Pizza;

/**
 * Created by 40741 on 2018/7/25.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngedientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clams Pizza");
        }
        // else if () {}...
        return pizza;
    }
}
