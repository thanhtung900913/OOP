package home_work.lab11.decorator_pattern.ex2;


public class NutsToppingDecorator implements ToppingDecorator{
    private IceCream iceScream;

    public NutsToppingDecorator(IceCream iceScream) {
        this.iceScream = iceScream;
    }

    @Override
    public String getDescription() {
        return iceScream.getDescription();
    }

    @Override
    public String addTopping() {
        return iceScream.getDescription()+", added nuts";
    }
}
