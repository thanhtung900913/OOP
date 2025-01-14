package homework.lab11.factory_method_pattern.ex2;

public abstract class Dialog {
    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.renderClick();
    }
    public abstract Button createButton();
}
