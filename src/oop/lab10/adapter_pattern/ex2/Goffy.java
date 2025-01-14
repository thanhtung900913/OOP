package oop.lab10.adapter_pattern.ex2;

public class Goffy implements Dog{
    @Override
    public void bark() {
        System.out.println("Ahoy");
    }

    @Override
    public void walk() {
        System.out.println("walking");
    }
}
