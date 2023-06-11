package murph.systemDesign.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override // just to confirm that it is overriding valid function from parent class
    public void drive(){
        System.out.println("Special Drive");
    }
}
