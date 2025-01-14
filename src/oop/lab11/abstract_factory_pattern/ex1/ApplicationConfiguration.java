package oop.lab11.abstract_factory_pattern.ex1;

public class ApplicationConfiguration {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
