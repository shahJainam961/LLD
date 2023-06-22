package murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.Decorator;

import murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.BasePizza;

public class Mushroom extends ToppingDecorator{
    private BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 10;
    }
}
