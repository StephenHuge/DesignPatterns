package factory004.v4.pizzav4;

import factory004.v4.ingredient.PizzaIngredientFactory;

/**
 * Created by 40741 on 2018/7/25.
 */
public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "clams pizza";
    }

    @Override
    public void prepare() {
        System.out.println("正在准备..." + name);
        dough = ingredientFactory.creatreDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }

}
