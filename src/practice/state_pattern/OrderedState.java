package practice.state_pattern;

public class OrderedState implements PackageState{
    @Override
    public void setNext(Context context) {
        context.setState(new DeliveryState());
    }

    @Override
    public void setPrev(Context context) {
        System.out.println("This is root state, cannot set previous state !!!");
    }

    @Override
    public void printState() {
        System.out.println("The package was order successfully !!!");
    }
}
