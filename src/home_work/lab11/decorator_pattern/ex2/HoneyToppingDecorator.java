package home_work.lab11.decorator_pattern.ex2;

public class HoneyToppingDecorator implements ToppingDecorator{
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public String addTopping() {
        return iceCream.getDescription()+", added honey";
    }
}
