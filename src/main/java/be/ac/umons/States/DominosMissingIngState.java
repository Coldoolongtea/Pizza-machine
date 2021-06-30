package be.ac.umons.States;

import be.ac.umons.ingredients.*;


public class DominosMissingIngState implements DominosState {

    public DominosMissingIngState(){

    }
    @Override
    public void run() {
        IngedientHouse ing = new IngedientHouse();
        System.out.println("Refilling the stock");
        ing.FillStock();
        ing.fillIng();
        }

    }

