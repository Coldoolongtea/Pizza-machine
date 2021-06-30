package be.ac.umons.util;


//crée UNIQUEMENT la factory dont on a besoin, mais ne cree pas de pizza
public class Factory {
    public static AbstractFactory getFactory(String name){
        if(name == "Dominos"){
            return FactoryDominos.getFactoryDominos();
        }else{
            return FactoryHut.getFactoryHut();
        }
    }
}
