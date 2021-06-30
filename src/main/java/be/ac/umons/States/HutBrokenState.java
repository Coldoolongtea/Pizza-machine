package be.ac.umons.States;

public class HutBrokenState implements HutState {

    public HutBrokenState(){

    }

    @Override
    public void run() {
        {
            System.out.println("La machine est en panne");
        }

    }
}
