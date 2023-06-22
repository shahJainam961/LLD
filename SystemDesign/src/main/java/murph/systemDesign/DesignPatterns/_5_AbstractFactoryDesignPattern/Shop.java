package murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern;

import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.Car;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory.AbstractCarFactory;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.FactoryProducer.FactoryProducer;

public class Shop {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractCarFactory factory = factoryProducer.getFactory("Economic");
        if(factory==null){
            System.out.println("No factory available !!");
            return;
        };
        Car car = factory.getInstance(99999999);
        if(car==null){
            System.out.println("No car available !!");
        }
        System.out.println(car.getTopspeed());
    }

}
