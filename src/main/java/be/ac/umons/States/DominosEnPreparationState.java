package be.ac.umons.States;
import be.ac.umons.Pizzas.*;
import be.ac.umons.ingredients.IngedientHouse;
import be.ac.umons.util.Cheesy;
import be.ac.umons.util.Pan;
import java.util.ArrayList;
import java.util.Map;
public class DominosEnPreparationState extends Thread implements DominosState {

    private Map<String,String> commandes;
    public DominosEnPreparationState(Map<String, String> commandes){
        this.commandes=commandes;
    }
    IngedientHouse ing = new IngedientHouse();
    public Pizza createPizza(String name){
        switch(name){
            case "Carbonara":
                Carbonara pizza = new Carbonara(ing);
                return pizza;
            case "Margherita":
                Margherita piz1 = new Margherita(ing);
                return piz1;
            case "FruittiDiMarre":
                FruttiDiMare piz2 = new FruttiDiMare(ing);
                return piz2;
            case "Prosciutto":
                Prosciutto piz3 = new Prosciutto(ing);
                return piz3;
        }
        return null;
    }

    @Override
    public void run() {
        try {
            var prep = 0;
            for (Map.Entry<String, String> set : commandes.entrySet()) {
                Pizza p = createPizza(set.getKey());
                System.out.print("La pizza " + p.getName() + " est en cours de préparation \n");

                if (set.getValue() == "Pan") {
                    Pan decor = new Pan();
                    p = decor.DecoratePizza(p);
                } else if (set.getValue() == "Cheesy") {
                    Cheesy decor = new Cheesy();
                    p = decor.DecoratePizza(p);
                }
                sleep(60000);
                System.out.print("La pizza " + p.getName() + " a été créée \n");
                commandes.clear();
            }
        }
        catch (InterruptedException e) {} // imposé par sleep
        ing.updateQueryDemo();
    }

}
