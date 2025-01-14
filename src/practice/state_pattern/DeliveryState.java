package practice.state_pattern;

public class DeliveryState implements PackageState{
    @Override
    public void setNext(Context context) {
        context.setState(new ReceivedState());
    }

    @Override
    public void setPrev(Context context) {
        context.setState(new OrderedState());
    }

    @Override
    public void printState() {
        System.out.println("The package is on the way to you !!!");
    }
}
