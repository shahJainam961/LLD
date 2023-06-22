package murph.systemDesign.DesignPatterns._1_StrategyDesignPattern;

import murph.systemDesign.DesignPatterns._1_StrategyDesignPattern.Strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialStrategy());
    }
}
