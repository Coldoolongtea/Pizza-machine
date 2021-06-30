package be.ac.umons;

import be.ac.umons.ingredients.IngedientHouse;
import be.ac.umons.util.AbstractFactory;
import be.ac.umons.util.Factory;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfectionPizzaController {
    @FXML
    private TextArea Screen;

    @FXML
    public void BeginPrerperation(Map commandes,String Resto) throws IOException {

        System.out.println("ok");
        Factory Restaurant = new Factory();
        AbstractFactory Fabrique = Restaurant.getFactory(Resto);
        Fabrique.createPizza(commandes);
        //afficheinfo();



    }
    @FXML
    private void gooBack() throws IOException {
        App.setRoot("primary");
    }
   /* @FXML
    private void afficheinfo() throws IOException{
        Screen.appendText("ok");
        Screen.appendText("\n");

    }*/
}
