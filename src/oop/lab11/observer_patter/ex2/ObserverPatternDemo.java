package lab11.Observer.ex2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver();
        new OctalObserver();
        new HexaObserver();

        System.out.println("First state change: State = 15");
        subject.setState(15);

        System.out.println("Second state change: State = 10");
        subject.setState(10);
    }
}
