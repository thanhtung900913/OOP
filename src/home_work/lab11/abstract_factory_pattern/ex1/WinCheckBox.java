package home_work.lab11.abstract_factory_pattern.ex1;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render a checkbox in Win style!");
    }
}
