package week1.oop;
import java.util.Scanner;
public class CircleComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scan.nextDouble();

        double diameter = 2 * radius;
        System.out.printf("Diameter is: %.2f%n",diameter);

        double circumferece = 2 * Math.PI * radius;
        System.out.printf("Circumference is: %.2f%n",circumferece);

        double are = Math.PI*radius*radius;
        System.out.printf("Area is : %.2f%n",are);
    }
}

