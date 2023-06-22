package murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.Decorator;

import murph.systemDesign.DesignPatterns._3_DecoratorDesignPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    private BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 20;
    }
}
