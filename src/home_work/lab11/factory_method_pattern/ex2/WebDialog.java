package home_work.lab11.factory_method_pattern.ex2;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
