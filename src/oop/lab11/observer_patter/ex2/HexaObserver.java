package lab11.Observer.ex2;

public class HexaObserver extends Observer{
    private Subject subject;
    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
