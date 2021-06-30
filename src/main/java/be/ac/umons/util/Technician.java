package be.ac.umons.util;

import be.ac.umons.ingredients.IngedientHouse;
import be.ac.umons.ingredients.Ingredient;

public class Technician extends Observer {
    private String Name;
    private Ingredient ing;

    public void update(Ingredient ing){

        System.out.println("Je suis Bob \n Le stock de " + ing.getName() + " est insuffisant \n Je vais remplir le stock");
        ing.setStock(5);

    }

}
