package be.ac.umons.util;

import be.ac.umons.Pizzas.Pizza;

public abstract class DecoratorPizza implements PizzaComponent{

    protected Pizza p;
    public abstract Pizza DecoratePizza(Pizza p);

}
