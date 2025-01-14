package practice.state_pattern;

public class ReceivedState implements PackageState{
    @Override
    public void setNext(Context context) {
        System.out.println("This is final state, cannot set next !!!");
    }

    @Override
    public void setPrev(Context context) {
        context.setState(new DeliveryState());
    }

    @Override
    public void printState() {
        System.out.println("You received the package !!!");
    }
}
