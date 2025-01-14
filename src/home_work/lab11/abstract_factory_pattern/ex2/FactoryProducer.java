package home_work.lab11.abstract_factory_pattern.ex2;

public class FactoryProducer {

    public AbstractFactory getFactory(String choice) {
        if(choice.equals("Rounded")){
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
