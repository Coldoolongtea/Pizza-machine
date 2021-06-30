package be.ac.umons.util;

import be.ac.umons.States.*;

import java.util.ArrayList;
import java.util.Map;

public class FactoryDominos extends AbstractFactory {


    private FactoryDominos() {
    }

    private static FactoryDominos instance = null;

    public static FactoryDominos getFactoryDominos() {
        if (instance == null)
            instance = new FactoryDominos();
        return instance;
    }


    @Override
    public void createPizza(Map<String,String> commandes) {

            DominosStateContext vend = new DominosStateContext();
            if(vend.check(commandes)){
                DominosEnPreparationState prep = new DominosEnPreparationState(commandes);
                vend.setState(prep);
                vend.run();
            }
            else {
                DominosMissingIngState missing = new DominosMissingIngState();
                vend.setState(missing);
                vend.run();
                DominosEnPreparationState prep = new DominosEnPreparationState(commandes);
                vend.setState(prep);
                vend.run();
}
    }}