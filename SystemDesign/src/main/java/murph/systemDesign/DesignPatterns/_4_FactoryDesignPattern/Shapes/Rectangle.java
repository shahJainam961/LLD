package murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
