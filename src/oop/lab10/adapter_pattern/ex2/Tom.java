package oop.lab10.adapter_pattern.ex2;

public class Tom implements Cat{

    @Override
    public void squeak() {
        System.out.println("Moew");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}
