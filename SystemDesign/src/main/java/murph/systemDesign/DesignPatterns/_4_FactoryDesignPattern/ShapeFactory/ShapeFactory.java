package murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.ShapeFactory;

import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes.Circle;
import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes.Rectangle;
import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes.Shape;
import murph.systemDesign.DesignPatterns._4_FactoryDesignPattern.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        if(shapeName.equals("Circle"))
            return new Circle();
        else if(shapeName.equals("Square"))
            return new Square();
        else if(shapeName.equals("Rectangle"))
            return new Rectangle();
        return null;
    }
}
