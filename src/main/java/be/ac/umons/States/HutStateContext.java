package be.ac.umons.States;

import be.ac.umons.Pizzas.Carbonara;
import be.ac.umons.Pizzas.FruttiDiMare;
import be.ac.umons.Pizzas.Margherita;
import be.ac.umons.Pizzas.Prosciutto;
import be.ac.umons.ingredients.IngedientHouse;

import java.util.Map;

public class HutStateContext {

    private HutState state;

    public HutStateContext(){
        //Etat par défaut
        state = new HutWaitingState();
    }

    public boolean check(Map<String, String> commandes){
        IngedientHouse ing = new IngedientHouse();
        return ing.checkDough() && ing.checkTomatoSauce() && ing.checkCheese() && ing.checkHam()
                && ing.checkWhiteCream() && ing.checkSeafood() && ing.checkMushroom() && ing.checkOlive() ;
    }

    public void setState(HutState newState){
        state = newState;
    }

    public void run(){
        state.run();
    }
}
