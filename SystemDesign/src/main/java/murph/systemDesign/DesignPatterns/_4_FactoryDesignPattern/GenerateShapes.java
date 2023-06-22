package murph.systemDesign.DesignPatterns._4_FactoryDesignPattern;

import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.ShapeFactory.ShapeFactory;
import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes.Shape;

public class GenerateShapes {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        if(shape==null)
            System.out.println("No such shape exists!");
        else shape.draw();

        shape = shapeFactory.getShape("Square");
        if(shape==null)
            System.out.println("No such shape exists!");
        else shape.draw();

        shape = shapeFactory.getShape("Rectangle");
        if(shape==null)
            System.out.println("No such shape exists!");
        else shape.draw();

        shape = shapeFactory.getShape("Parabola");
        if(shape==null)
            System.out.println("No such shape exists!");
        else shape.draw();
    }
}
