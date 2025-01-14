package home_work.lab11.factory_method_pattern.ex2;

public class HtmlButton implements Button{
    @Override
    public void renderClick() {
        System.out.println("Render a button in HTML style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a web browser click event.");
    }
}
