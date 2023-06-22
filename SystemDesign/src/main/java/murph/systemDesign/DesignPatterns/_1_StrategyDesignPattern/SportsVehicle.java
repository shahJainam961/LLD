package murph.systemDesign.DesignPatterns._1_StrategyDesignPattern;

import murph.systemDesign.DesignPatterns._1_StrategyDesignPattern.Strategy.SpecialStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SpecialStrategy());
    }
}
