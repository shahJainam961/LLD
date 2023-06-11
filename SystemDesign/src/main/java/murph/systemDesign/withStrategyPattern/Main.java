package murph.systemDesign.withStrategyPattern;

import murph.systemDesign.withStrategyPattern.Strategy.NormalStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
        vehicle = new SportsVehicle();
        vehicle.drive();
        // Hence if we need another drive strategy we will add class for it and
        // implements the interface and use it as an object in the child vehicle when needed
        // and pass the new strategy object to the super class vehicle via constructor of child class vehicle
    }
}
