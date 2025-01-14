package homework.lab11.abstract_factory_pattern.ex1;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render a checkbox in Mac style!");
    }
}
