package murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.CarFactory;

import murph.systemDesign.DesignPatterns._5_AbstractFactoryDesignPattern.Cars.Car;

public interface AbstractCarFactory {
    Car getInstance(int price);
}
