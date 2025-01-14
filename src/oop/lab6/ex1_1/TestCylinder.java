package lab6.ex1_1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylider1 = new Cylinder();
        System.out.println("Cylinder:"+" radius= "+cylider1.getRadius()
        + " height="+cylider1.getHeight()
        + " base area=" + cylider1.getArea()
        + " volume="+cylider1.getVolume());

        Cylinder cylider2 = new Cylinder(20.0);
        System.out.println("Cylinder:"+" radius= "+cylider2.getRadius()
                + " height="+cylider2.getHeight()
                + " base area=" + cylider2.getArea()
                + " volume="+cylider2.getVolume());

        Cylinder cylider3 = new Cylinder(2.0,30.0);
        System.out.println("Cylinder:"+" radius= "+cylider3.getRadius()
                + " height="+cylider3.getHeight()
                + " base area=" + cylider3.getArea()
                + " volume="+cylider3.getVolume());


    }
}
