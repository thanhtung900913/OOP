package lab6.ex2_2;

public class Test {
    public static void main(String[] args) {
        // Tạo một đối tượng Circle mới với bán kính mặc định
        Circle circle1 = new Circle();

        // In ra thông tin về Circle đầu tiên
        System.out.println("Circle 1 information: ");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("String representation: " + circle1);

        // Tạo một đối tượng Circle mới với bán kính và màu sắc được chỉ định
        Circle circle2 = new Circle(2.5, "blue");

        // In ra thông tin về Circle thứ hai
        System.out.println("\nCircle 2 information: ");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("String representation: " + circle2);

        // Đặt lại bán kính và màu sắc của Circle thứ hai
        circle2.setRadius(3.0);
        circle2.setColor("green");

        // In ra thông tin về Circle thứ hai sau khi thay đổi
        System.out.println("\nUpdated Circle 2 information: ");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("String representation: " + circle2);
    }
}
