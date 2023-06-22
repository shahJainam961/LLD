package murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory;

import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.Car;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.LuxuryCar1;
import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.LuxuryCar2;

public class LuxuryCarFactory implements AbstractCarFactory {
    @Override
    public Car getInstance(int price) {
        if(price>=1000000 && price<=2000000)
            return new LuxuryCar1();
        else if(price>2000000)
            return new LuxuryCar2();
        return null;
    }
}
