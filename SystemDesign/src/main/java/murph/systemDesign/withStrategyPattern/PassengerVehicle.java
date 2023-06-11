package murph.systemDesign.withStrategyPattern;

import murph.systemDesign.withStrategyPattern.Strategy.DriveStrategy;
import murph.systemDesign.withStrategyPattern.Strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalStrategy());
    }
}
