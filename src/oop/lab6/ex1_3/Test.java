package lab6.ex1_3;

public class Test {
    public static void main(String[] args) {
        // test constructor
        Point2D point = new Point2D(3, 4);

        // In ra tọa độ x và y của điểm
        System.out.println("" + point.getX() + ", " + point.getY() + ")");

        // test setter
        point.setX(5);
        point.setY(7);

        System.out.println("(" + point.getX() + ", " + point.getY() + ")");

        // test getter
        float[] xy = point.getXY();
        System.out.println("(" + xy[0] + ", " + xy[1] + ")");

        point.setXY(1, 2);
        System.out.println(point);

        // Test toString
        System.out.println(point.toString());
    }
}
