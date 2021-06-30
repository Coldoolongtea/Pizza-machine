package be.ac.umons.Pizzas;

import be.ac.umons.ingredients.*;


public class FruttiDiMare extends Pizza {



    public FruttiDiMare(IngedientHouse ing) {
        super("FruttiDiMare");

        Dough pate = ing.getPate();
        TomatoSauce sauceTomate = ing.getSauceTomate();
        Cheese fromage = ing.getFromage();
        Seafood fruitsDeMer = ing.getFruitDeMer();

        addIngredient(pate);
        addIngredient(sauceTomate);
        addIngredient(fromage);
        addIngredient(fruitsDeMer);

        super.calcPrice();

    }

}
