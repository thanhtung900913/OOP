package oop.lab10.adapter_pattern.ex2;

public class App {
    public static void main(String[] args) {
        Tom c1 = new Tom();
        Dog c2 = new TomAdaptor(c1);
        c2.bark();
    }
}
