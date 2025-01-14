package home_work.lab11.abstract_factory_pattern.ex1;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox craeteCheckBox() {
        return new MacCheckBox();
    }
}
