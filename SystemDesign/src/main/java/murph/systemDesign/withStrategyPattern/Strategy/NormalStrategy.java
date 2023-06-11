package murph.systemDesign.withStrategyPattern.Strategy;

public class NormalStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
