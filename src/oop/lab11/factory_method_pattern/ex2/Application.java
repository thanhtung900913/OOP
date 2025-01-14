package oop.lab11.factory_method_pattern.ex2;

public class Application {
    public static void main(String[] args) {
        Dialog d1 = new WindowsDialog();
        Dialog d2 = new WebDialog();
        d1.render();
        d2.render();
    }
}
