package oop.lab11.decorator_pattern.ex2;

public class App {
    public static void main(String[] args) {
        IceCream c1 = new ChocolateIceCream();
        IceCream c2 = new StrawberryIceCream();
        System.out.println(c1.getDescription());
        System.out.println(c2.getDescription());
        ToppingDecorator d1 = new HoneyToppingDecorator(c1);
        System.out.println(d1.addTopping());
        d1.getDescription();
    }
}
