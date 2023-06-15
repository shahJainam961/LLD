package murph.systemDesign._1_StrategyDesignPattern.Strategy;

public class SpecialStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
