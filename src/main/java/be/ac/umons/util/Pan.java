package be.ac.umons.util;

import be.ac.umons.Pizzas.Pizza;

import java.math.BigDecimal;

public class Pan extends DecoratorPizza {
    public Pan(){};

    public String getName(){
        return this.getName();
    };
    public BigDecimal getPrice(){
        return this.getPrice();
    };
    public void setName(String n){
        this.setName(n);
    }
    public void setPrice(BigDecimal p){
        this.setPrice(p);
    }


    public Pizza DecoratePizza(Pizza p){
        p.setName("Pan " + p.getName());
        p.setPrice(p.getPrice().add(new BigDecimal(1.5)));
        return p;
    };

}
