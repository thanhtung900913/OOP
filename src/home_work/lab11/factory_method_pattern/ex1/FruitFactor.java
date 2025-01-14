package home_work.lab11.factory_method_pattern.ex1;

public class FruitFactor {
    public FruitFactor() {
    }

    public Fruit providerFruit(String name){
        if(name.equals("Apple")){
            return new Apple();
        }else if(name.equals("Banana")){
            return new Banana();
        }else if(name.equals("Orange")){
            return new Orange();
        }
        return null;
    }
}
