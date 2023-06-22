package murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern;

import murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.Decorator.ExtraCheese;
import murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.Decorator.Mushroom;

public class PizzaBilling {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new ExtraCheese(new Margherita())));
        System.out.println(pizza.getCost());
    }
}
