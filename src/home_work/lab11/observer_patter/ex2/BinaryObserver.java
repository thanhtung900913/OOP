package lab11.Observer.ex2;

public class BinaryObserver extends Observer{
    private Subject subject;
    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
