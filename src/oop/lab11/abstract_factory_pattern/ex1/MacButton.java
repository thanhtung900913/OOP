package oop.lab11.abstract_factory_pattern.ex1;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render a button in Mac style!");
    }
}
