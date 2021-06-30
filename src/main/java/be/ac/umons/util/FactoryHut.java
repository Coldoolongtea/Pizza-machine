package be.ac.umons.util;

import be.ac.umons.States.HutEnPrepatationState;
import be.ac.umons.States.HutMissingIngState;
import be.ac.umons.States.HutStateContext;

import java.util.ArrayList;
import java.util.Map;

public class FactoryHut extends AbstractFactory{
    private FactoryHut(){}

    private static FactoryHut instance=null;

    public static FactoryHut getFactoryHut(){
        if (instance==null)
            instance = new FactoryHut();
        return instance;
    }

    @Override
        public void createPizza(Map<String,String> commandes){
        HutStateContext vend = new HutStateContext();
        if(vend.check(commandes)){
        HutEnPrepatationState prep = new HutEnPrepatationState(commandes);
        vend.setState(prep);
        vend.run();
        }
        else {
            HutMissingIngState missing = new HutMissingIngState();
            vend.setState(missing);
            vend.run();
            HutEnPrepatationState prep = new HutEnPrepatationState(commandes);
            vend.setState(prep);
            vend.run();
}}
}
