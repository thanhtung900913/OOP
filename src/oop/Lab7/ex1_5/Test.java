package Lab7.ex1_5;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.toString();
        //
        Rectangle r1 = new Rectangle(1,2);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        r1.toString();

        ResizableCircle rs = new ResizableCircle(2.0);
        Circle r2 = (Circle) rs;
        rs.resize(20);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
