package homework.lab11.factory_method_pattern.ex2;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
