package oop.lab11.abstract_factory_pattern.ex2;

public class ShapeFactory extends AbstractFactory {


    @Override
    Shape getShape(String name) {
        if(name.equals("Rectangle")){
            return new Rectangle();
        }
        return new Square();
    }
}
