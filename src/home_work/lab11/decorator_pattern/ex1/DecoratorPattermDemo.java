package home_work.lab11.decorator_pattern.ex1;

public class DecoratorPattermDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        ShapeDecorator d1 = new ShapeDecorator(s1);
        d1.draw();
        ShapeDecorator d2 = new RedShapeDecorator(s2);
        d2.draw();
    }
}
