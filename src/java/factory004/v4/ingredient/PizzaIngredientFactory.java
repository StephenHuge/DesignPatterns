package factory004.v4.ingredient;

/**
 * Created by 40741 on 2018/7/25.
 */
public interface PizzaIngredientFactory {

    public Dough creatreDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
