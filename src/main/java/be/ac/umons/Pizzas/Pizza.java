package be.ac.umons.Pizzas;

import be.ac.umons.ingredients.Ingredient;
import be.ac.umons.util.PizzaComponent;
import java.math.BigDecimal;
import java.util.*;

public class Pizza implements PizzaComponent {
    private String name;
    private BigDecimal price = new BigDecimal(0.0);
    private ArrayList<Ingredient> listIngredients = new ArrayList<Ingredient>();

    public Pizza(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };
    public BigDecimal getPrice(){
        return price;
    };
    public void setName(String n){
        this.name=n;
    }
    public void setPrice(BigDecimal p){
        this.price=p;
    }
    public ArrayList<Ingredient> getListIngredient(){
        return listIngredients;
    }
    public void addIngredient(Ingredient i){
        listIngredients.add(i);
    }
    public String toString(){
        return null;
    }

    void calcPrice(){
        BigDecimal prix = new BigDecimal(0);
        for (Ingredient ing : listIngredients){
            prix=prix.add(ing.getPrice());
        }
        this.price=prix;
    }


}

