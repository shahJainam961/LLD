package murph.systemDesign._1_StrategyDesignPattern;

import murph.systemDesign._1_StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    // Constructor Injection
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
