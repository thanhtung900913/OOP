package lab11.Observer.ex2;

public class OctalObserver extends Observer{
    private Subject subject;
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
