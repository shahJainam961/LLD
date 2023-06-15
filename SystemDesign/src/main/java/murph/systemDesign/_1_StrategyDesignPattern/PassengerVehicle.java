package murph.systemDesign._1_StrategyDesignPattern;

import murph.systemDesign._1_StrategyDesignPattern.Strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalStrategy());
    }
}
