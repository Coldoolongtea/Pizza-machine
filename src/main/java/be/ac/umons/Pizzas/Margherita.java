package be.ac.umons.Pizzas;

import be.ac.umons.ingredients.Cheese;
import be.ac.umons.ingredients.Dough;
import be.ac.umons.ingredients.IngedientHouse;
import be.ac.umons.ingredients.TomatoSauce;

public class Margherita extends Pizza {




    public Margherita(IngedientHouse ing){
        super("Margerita");

        Dough pate = ing.getPate();
        TomatoSauce sauceTomate = ing.getSauceTomate();
        Cheese fromage = ing.getFromage();

        addIngredient(pate);
        addIngredient(sauceTomate);
        addIngredient(fromage);
         super.calcPrice();

    }

}
