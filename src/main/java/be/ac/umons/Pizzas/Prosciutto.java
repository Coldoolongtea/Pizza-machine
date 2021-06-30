package be.ac.umons.Pizzas;

import be.ac.umons.ingredients.*;

public class Prosciutto extends Pizza {

    public Prosciutto(IngedientHouse ing) {
        super("Prosciutto");


        Dough pate = ing.getPate();
        TomatoSauce sauceTomate = ing.getSauceTomate();
        Cheese fromage = ing.getFromage();
        Ham jambon = ing.getJambon();

        addIngredient(sauceTomate);
        addIngredient(fromage);
        addIngredient(jambon);
        super.calcPrice();
        }


}
