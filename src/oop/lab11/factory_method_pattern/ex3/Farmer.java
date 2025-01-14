package oop.lab11.factory_method_pattern.ex3;

public abstract class Farmer {
    public abstract Flower plant();
    public void raise(){
        Flower flower = plant();
        flower.use();
    }
}
