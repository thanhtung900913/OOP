package oop.lab11.factory_method_pattern.ex1;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactor f = new FruitFactor();
        Fruit fruit1 = f.providerFruit("Apple");
        Fruit fruit2 = f.providerFruit("Banana");
        Fruit fruit3 = f.providerFruit("Orange");
        fruit1.produceJuice();
        fruit2.produceJuice();
        fruit3.produceJuice();
    }
}
