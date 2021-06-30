package be.ac.umons.States;

import be.ac.umons.Pizzas.*;

import java.util.Map;

public class HutWaitingState implements HutState {

    public HutWaitingState(){

    }


    @Override
    public void run() {
        {
            System.out.println("La machine est en attente");
        }

    }
}

