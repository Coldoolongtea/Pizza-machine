package be.ac.umons;

import be.ac.umons.ingredients.IngedientHouse;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DominosController{
    ConfectionPizzaController i = new ConfectionPizzaController();

    private String DoughType;
    private  String nompizza;
    private IngedientHouse ing;
    private Map<String, String> commandes = new HashMap<>();

    @FXML
    private RadioButton Margherita;
    @FXML
    private RadioButton Prosciutto;
    @FXML
    private RadioButton FruttiDiMarre;
    @FXML
    private RadioButton Carbonara;
    @FXML
    private RadioButton BasicDough;
    @FXML
    private RadioButton Pan;
    @FXML
    private RadioButton Cheesy;
    @FXML
    private Label PrepState;
    @FXML
    private TextArea Screen;

    @FXML
    private void BeginPrerperation() throws IOException {

        //App.setRoot("ConfectionPizza");
        i.BeginPrerperation(commandes,"Hut");


    }

    @FXML
    private void FillStock()throws IOException{
        System.out.println("Filling");
        ing.FillStock();
    }
    /* @FXML
      public void BeginPreparation() throws IOException
      {
          FXMLLoader loader = new  FXMLLoader(getClass().getResource("HutPreperation"));
          Parent root= loader.load();


          //access the controller and call a method
          PreperationHutController controller = loader.getController();
          controller.getData(Commandes,DoughType);

          Stage stage = new Stage();
          stage.setScene(new Scene(root));
          stage.setTitle("HutPreparation");
          stage.show();
      }
  */
    @FXML
    private void HandlePizzaType(){



    }


    @FXML
    private void HandleDoughType(){

    }
    @FXML
    private void AddToOrder(){

        if(Margherita.isSelected()){

            nompizza="Margherita";
        }else if(Carbonara.isSelected()){

            nompizza="Carbonara";
        }else if(Prosciutto.isSelected()){

            nompizza="Prosciutto";
        }else {

            nompizza="FruittiDiMarre";
        }

        if(BasicDough.isSelected()){
            DoughType = "basic";
        }
        else if(Pan.isSelected()){
            DoughType = "Pan";

        }
        else{
            DoughType ="Cheesy";

        }
        commandes.put(nompizza,DoughType);
        PrepState.setText("Pizza " + nompizza + " "+ DoughType+" added to your order");
        Screen.appendText(nompizza);
        Screen.appendText("\n");

        System.out.println(nompizza + " " + commandes.get(nompizza));

    }
    @FXML
    private void goBack() throws IOException {
        App.setRoot("primary");
    }

}
