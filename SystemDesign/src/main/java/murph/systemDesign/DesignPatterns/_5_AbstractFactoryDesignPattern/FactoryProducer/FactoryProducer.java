package murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.FactoryProducer;

import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory.EconomicCarFactory;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory.AbstractCarFactory;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory.LuxuryCarFactory;

public class FactoryProducer {
    public AbstractCarFactory getFactory(String factoryType){
        if(factoryType.equals("Economic"))
            return new EconomicCarFactory();
        else if(factoryType.equals("Luxury"))
            return new LuxuryCarFactory();
        return null;
    }
}
