package be.ac.umons.ingredients;

import be.ac.umons.util.Technician;

import java.math.BigDecimal;

public class Olive extends Ingredient {

    private static int stock;
    private static BigDecimal prix;


    public Olive(){
        super.setName("Olive");
        stock = stock-1;


    }
    public void decrementestock(){
      stock=stock-1;
    }

    public void setStock(int stockbd){
        stock=stockbd;
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



