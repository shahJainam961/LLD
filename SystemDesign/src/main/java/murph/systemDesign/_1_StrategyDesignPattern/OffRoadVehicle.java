package murph.systemDesign._1_StrategyDesignPattern;

import murph.systemDesign._1_StrategyDesignPattern.Strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialStrategy());
    }
}
