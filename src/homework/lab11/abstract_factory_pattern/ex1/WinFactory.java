package homework.lab11.abstract_factory_pattern.ex1;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox craeteCheckBox() {
        return new WinCheckBox();
    }
}
