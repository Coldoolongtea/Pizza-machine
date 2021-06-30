package be.ac.umons.util;

import java.math.BigDecimal;

public interface PizzaComponent {
    public abstract String getName();
    public abstract BigDecimal getPrice();
    public abstract void setName(String n);
    public abstract void setPrice(BigDecimal p);
    public abstract String toString();
}
