package murph.systemDesign.withStrategyPattern;

import murph.systemDesign.withStrategyPattern.Strategy.DriveStrategy;
import murph.systemDesign.withStrategyPattern.Strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialStrategy());
    }
}
