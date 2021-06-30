package be.ac.umons.ingredients;

import be.ac.umons.util.Technician;

import java.math.BigDecimal;

public class TomatoSauce extends Ingredient {
   private static int stock;
   private static BigDecimal prix;

   private Technician Bob = new Technician();
   public TomatoSauce(){
      stock = stock-1;
      super.setName("TomatoSauce");


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
