package lab6.ex1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("White", false);
        System.out.println(shape2.toString());

        System.out.println("Shape2: color="+shape2.getColor()
        +" fill: "+ shape2.isFilled());

        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println(shape2.toString());
    }
}
