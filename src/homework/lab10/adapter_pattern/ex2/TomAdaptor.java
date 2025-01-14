package homework.lab10.adapter_pattern.ex2;

public class TomAdaptor implements Dog{
    private Tom tom;
    public TomAdaptor(Tom tom){
        this.tom = tom;
    }

    @Override
    public void bark() {
        tom.squeak();
    }

    @Override
    public void walk() {
        tom.walk();
    }
}
