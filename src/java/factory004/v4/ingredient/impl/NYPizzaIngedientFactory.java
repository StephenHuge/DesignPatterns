package factory004.v4.ingredient.impl;

import factory004.v4.ingredient.*;

/**
 * Created by 40741 on 2018/7/25.
 */
public class NYPizzaIngedientFactory implements PizzaIngredientFactory {
    @Override
    public Dough creatreDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MrinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
