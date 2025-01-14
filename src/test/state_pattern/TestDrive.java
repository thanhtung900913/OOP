package test.state_pattern;

public class TestDrive {
    public static void main(String[] args) {
        Context pkg = new Context();
        pkg.getSate();

        pkg.next();
        pkg.getSate();

        pkg.next();
        pkg.getSate();

        pkg.next();
        pkg.getSate();

    }
}
