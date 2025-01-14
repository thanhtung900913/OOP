package home_work.lab11.decorator_pattern.ex2;

public interface ToppingDecorator extends IceCream {
    public abstract String getDescription();
    String addTopping();
}
