package murph.systemDesign.withoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        // So here as you can see there is Special drive functionality implemented in both
        // OffRoad and Sports Vehicle hence leading to redundant code and more redundancy in future if more functionality
        // other than drive comes and the children have some common functionality to implement
        // So when children have implementation of some functionality similar then use Strategy Design Pattern.
    }
}
