package be.ac.umons.ingredients;

import be.ac.umons.database.DBSingleton;
import be.ac.umons.ingredients.*;
import be.ac.umons.util.AnsiColor;
import be.ac.umons.util.ColorPrint;
import be.ac.umons.util.Technician;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import static be.ac.umons.App.formatDotDecimal;

public class IngedientHouse {


    private static ArrayList<String> Commandes = new ArrayList();
    private List<Technician> obs = new ArrayList<Technician>();
    public void addObservers(Technician T){
        obs.add(T);
    }
    public void removeObservers(Technician T){
        obs.remove(T);
    }
    public void notifyTechnicians(Ingredient ing){
        for( Technician T :obs ){
            T.update(ing);
        }
    }
    public Olive getOl() {
        if(Ol.getStock()<=2){
            notifyTechnicians(Ol);

        }

        Ol.decrementestock();
        Commandes.add("Ham");
        return Ol;

    }

    private Olive Ol = new Olive();

    public boolean checkOlive(){
        if(Ol.getStock()<2)
            return false;
        else return true;
    }

    public boolean checkSeafood(){
        if(fruitDeMer.getStock()<2)
            return false;
        else return true;
    }


    public Seafood getFruitDeMer() {
        if(fruitDeMer.getStock()<=2){

            notifyTechnicians(fruitDeMer);

        }

            fruitDeMer.decrementestock();
            Commandes.add("Sea food");
            return fruitDeMer;


    }

    private Seafood fruitDeMer = new Seafood();

    public boolean checkMushroom(){
        if(champignon.getStock()<=2)
            return false;
        else return true;
    }

    public Mushroom getChampignon() {
        if (champignon.getStock() <= 2) {
            notifyTechnicians(champignon);
        }

            champignon.decrementestock();
            Commandes.add("Mushroom");
            return champignon;


    }
    private Mushroom champignon = new Mushroom();

    public boolean checkWhiteCream(){
        if(fruitDeMer.getStock()<2)
            return false;
        else return true;
    }

    public WhiteCream getCremeBlanche() {
        if(cremeBlanche.getStock()<=2){
            notifyTechnicians(cremeBlanche);

        }

        cremeBlanche.decrementestock();
        Commandes.add("White Cream");
        return cremeBlanche;


    }

    private  WhiteCream cremeBlanche = new WhiteCream();

    public boolean checkHam(){
        if(jambon.getStock()<2)
            return false;
        else return true;
    }

    public Ham getJambon() {
        if(jambon.getStock()<=2){
            notifyTechnicians(jambon);

        }

            jambon.decrementestock();
            Commandes.add("Ham");
            return jambon;

    }

    private Ham jambon = new Ham();

    public boolean checkDough(){
        if(pate.getStock()<2)
            return false;
        else return true;
    }

    public Dough getPate() {
        if(pate.getStock()<=2){
            notifyTechnicians(pate);

    }

            pate.decrementestock();
            Commandes.add("Dough");
            return pate;

    }

    private  Dough pate = new Dough();

    public boolean checkCheese(){
        if(fromage.getStock()<2)
            return false;
        else return true;
    }

    public Cheese getFromage() {
        if(fromage.getStock()<=2){
        notifyTechnicians(fromage);

        }

            fromage.decrementestock();
            Commandes.add("Cheese");
            return fromage;

    }

    private Cheese fromage = new Cheese();

    public boolean checkTomatoSauce(){
        if(sauceTomate.getStock()<2)
            return false;
        else return true;
    }

    public TomatoSauce getSauceTomate() {
        if(sauceTomate.getStock()<2){
            notifyTechnicians(sauceTomate);

        }

                sauceTomate.decrementestock();
                Commandes.add("Tomato Sauce");
                return sauceTomate;

    }

    private TomatoSauce sauceTomate = new TomatoSauce();

     public IngedientHouse() {
         Technician Bob = new Technician();
         addObservers(Bob);
         try {

             //DBSingleton db = DBSingleton.getSingleton("jdbc://localhost:3306/, "username", "password");
             DBSingleton db = DBSingleton.getSingleton("jdbc:mysql://localhost:3306/pizzeria?serverTimezone=Europe/Brussels", "root", "");

             ResultSet rs = db.querySelect("SELECT * FROM ingredients");

             while (rs.next()) {

                 //if(rs.getString("name").compareTo("Olive")==0){
                 //    new Olive(rs.getBigDecimal("price"),rs.getInt(("stock")));
                 //}
                 switch (rs.getString("name")) {
                     case "Olive":
                         Ol.setStock(rs.getInt("stock"));
                         Ol.setPrice(rs.getBigDecimal("price"));

                         break;
                     case "Sea food":
                         fruitDeMer.setStock(rs.getInt("stock"));
                         fruitDeMer.setPrice(rs.getBigDecimal("price"));
                         break;
                     case "Mushroom":
                         champignon.setStock(rs.getInt("stock"));
                         champignon.setPrice(rs.getBigDecimal("price"));
                         break;
                     case "White Cream":

                         cremeBlanche.setStock(rs.getInt("stock"));
                         cremeBlanche.setPrice(rs.getBigDecimal("price"));
                         break;
                     case "Ham":

                         jambon.setStock(rs.getInt("stock"));
                         jambon.setPrice(rs.getBigDecimal("price"));
                         break;
                     case "Dough":

                         this.pate.setStock(rs.getInt("stock"));

                         this.pate.setPrice(rs.getBigDecimal("price"));

                         break;
                     case "Cheese":

                         fromage.setStock(rs.getInt("stock"));
                         fromage.setPrice(rs.getBigDecimal("price"));
                         break;
                     case "Tomato Sauce":

                         sauceTomate.setStock(rs.getInt("stock"));
                         sauceTomate.setPrice(rs.getBigDecimal("price"));
                         break;
                 }

             }

             rs.close();

             //updateQueryDemo();


         } catch (
                 SQLException e) {
             ColorPrint.printError("SQL ERROR : " + e.getMessage());
         } catch (
                 NullPointerException e) {
             System.out.print(AnsiColor.RED);
             e.printStackTrace();
             System.out.print(AnsiColor.RESET);
         }



     }
    public void updateQueryDemo() {

        try {
            //DBSingleton db = DBSingleton.getSingleton(url, username, password);
            DBSingleton db = DBSingleton.getSingleton("jdbc:mysql://localhost:3306/pizzeria?serverTimezone=Europe/Brussels", "root", "");


                Object[] arguments = new Object[2];



                ResultSet rs = db.querySelect("SELECT * FROM ingredients");

                while (rs.next()) {

                    switch (rs.getString("name")) {
                        case "Olive":
                            arguments[0] =  Ol.getStock();
                            arguments[1] = "Olive";

                            break;
                        case "Sea food":
                            arguments [0] = fruitDeMer.getStock();
                            arguments[1] = "Sea food";
                            break;
                        case "Mushroom":
                            arguments[0] = champignon.getStock();
                            arguments[1] = "Mushroom";
                            break;
                        case "White Cream":

                            arguments[0] = cremeBlanche.getStock();
                            arguments[1] = "White Cream";
                            break;
                        case "Ham":

                            arguments[0] = jambon.getStock();
                            arguments[1] = "Ham";

                            break;
                        case "Dough":

                            arguments[0]= pate.getStock();
                            arguments[1] = "Dough";


                            break;
                        case "Cheese":

                            arguments[0] = fromage.getStock();
                            arguments[1] = "Cheese";
                            break;
                        case "Tomato Sauce":

                            arguments[0] = sauceTomate.getStock();
                            arguments[1] = "Tomato Sauce";

                            break;
                    }


                    int result = db.queryUpdate("UPDATE ingredients SET stock = %s WHERE name = '%s'", arguments);
                    ColorPrint.printDebug("updating ingredients return value : " + result);
                }




                rs.close();


             }catch(SQLException e){
                ColorPrint.printError("SQL Error : " + e.getMessage());
            } catch(NullPointerException e){
                ColorPrint.printError(e.getMessage());
            }
        }
    public static void FillStock() {

        try {
            //DBSingleton db = DBSingleton.getSingleton(url, username, password);
            DBSingleton db = DBSingleton.getSingleton("jdbc:mysql://localhost:3306/pizzeria?serverTimezone=Europe/Brussels", "root", "");


                Object[] arguments = new Object[1];
                arguments[0] = 5;



                int result = db.queryUpdate("UPDATE ingredients SET stock = %s" , arguments);
                ColorPrint.printDebug("updating ingredients return value : " + result);



        } catch(NullPointerException e){
            ColorPrint.printError(e.getMessage());
        }
    }

    public void fillIng(){
        sauceTomate.setStock(5);
        Ol.setStock(5);
        fromage.setStock(5);
        jambon.setStock(5);
        sauceTomate.setStock(5);
        cremeBlanche.setStock(5);
        pate.setStock(5);
        champignon.setStock(5);
        fruitDeMer.setStock(5);
    }


}

