package oop.lab11.abstract_factory_pattern.ex2;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String name) {
        if(name.equals("RoundedSquare")){
            return new RoundedSquare();
        }
        return new RoundedRectangle();
    }
}
