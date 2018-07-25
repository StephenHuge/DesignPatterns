package factory004.v4.pizzav4;

import factory004.v4.ingredient.PizzaIngredientFactory;

/**
 * Created by 40741 on 2018/7/23.
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "cheese pizza";
    }

    @Override
    public void prepare() {
        System.out.println("正在准备..." + name);
        dough = ingredientFactory.creatreDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }
}
