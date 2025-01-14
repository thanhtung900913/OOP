package homework.lab11.factory_method_pattern.ex2;

public class WindowsButton implements Button{
    @Override
    public void renderClick() {
        System.out.println("Render a button in Windows style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a native OS click event.");
    }
}
