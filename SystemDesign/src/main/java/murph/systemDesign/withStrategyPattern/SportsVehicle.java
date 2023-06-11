package murph.systemDesign.withStrategyPattern;

import murph.systemDesign.withStrategyPattern.Strategy.DriveStrategy;
import murph.systemDesign.withStrategyPattern.Strategy.SpecialStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SpecialStrategy());
    }
}
