package be.ac.umons;

import java.io.IOException;

import be.ac.umons.App;
import be.ac.umons.util.AbstractFactory;
import be.ac.umons.util.Factory;
import javafx.fxml.FXML;


//Actions dispos sur la première page
public class PrimaryController {

    @FXML

        private void BuildPizzaHut() throws IOException{

            App.setRoot("PizzaHut");
        }
        @FXML
        private void BuildPizzaDominos() throws IOException{

            App.setRoot("Dominos");
        }

}
