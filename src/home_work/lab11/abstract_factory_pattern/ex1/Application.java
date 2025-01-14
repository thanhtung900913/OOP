package home_work.lab11.abstract_factory_pattern.ex1;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }
    public void createUI(){
        this.button = factory.createButton();
    }
    public void paint(){
        button.paint();
    }
}
