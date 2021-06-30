package be.ac.umons.Pizzas;


import be.ac.umons.ingredients.*;

public class Carbonara extends Pizza {



    public Carbonara(IngedientHouse ing){

        super("Carbonara");

        Dough pate = ing.getPate();
        WhiteCream cremeBlanche = ing.getCremeBlanche();
        Cheese fromage = ing.getFromage();
        Ham Jambon = ing.getJambon();

        addIngredient(pate);
        addIngredient(cremeBlanche);
        addIngredient(fromage);
        addIngredient(Jambon);

        super.calcPrice();

    }


}
