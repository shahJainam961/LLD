package murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory;

import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.Car;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.EconomicCar1;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.EconomicCar2;

public class EconomicCarFactory implements AbstractCarFactory {
    @Override
    public Car getInstance(int price) {
        if(price<=300000)
            return new EconomicCar1();
        else if(price>300000)
            return new EconomicCar2();
        return null;
    }
}
