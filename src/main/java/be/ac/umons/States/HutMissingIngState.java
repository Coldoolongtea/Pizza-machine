package be.ac.umons.States;

import be.ac.umons.ingredients.*;

public class HutMissingIngState implements HutState {

    public HutMissingIngState(){}

    @Override
    public void run() {
    IngedientHouse ing = new IngedientHouse();
    System.out.println("Refilling the stock");
    ing.FillStock();
    ing.fillIng();
    }
}
