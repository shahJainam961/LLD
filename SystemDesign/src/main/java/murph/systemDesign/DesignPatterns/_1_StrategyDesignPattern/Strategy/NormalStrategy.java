package murph.systemDesign.DesignPatterns._1_StrategyDesignPattern.Strategy;

public class NormalStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
