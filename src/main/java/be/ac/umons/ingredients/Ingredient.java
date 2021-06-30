package be.ac.umons.ingredients;

import be.ac.umons.util.PizzaComponent;
import be.ac.umons.util.Technician;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ingredient implements PizzaComponent {
    private String name;
    private BigDecimal price;
    private int stock;


    public Ingredient() {    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public int getStock(){
        return stock;
    }

    public void setStock(int reserves){
        this.stock=reserves;
    }

}
