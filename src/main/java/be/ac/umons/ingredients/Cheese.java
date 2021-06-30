package be.ac.umons.ingredients;

import be.ac.umons.util.Technician;

import java.math.BigDecimal;

public class Cheese extends Ingredient {


    private  int stock;
    private static BigDecimal prix;



    public Cheese(){
        super.setName("Cheese");
        stock = stock-1;


    }
    public void setStock(int stockbd){
        stock=stockbd;
    }
    public void decrementestock(){

       stock=stock-1;
    }
    public void setPrice(BigDecimal prixbd){
        prix=prixbd;
    }
    public BigDecimal getPrice(){
        return prix;
    }

    public int getStock(){
        return stock;
    }

}

