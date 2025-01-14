package oop.lab11.abstract_factory_pattern.ex2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        String choice = "Rounded";
        String name = "RoundedSquare";
        FactoryProducer f = new FactoryProducer();
        AbstractFactory a = f.getFactory(choice);
        Shape s = a.getShape(name);
        s.draw();
    }
}
