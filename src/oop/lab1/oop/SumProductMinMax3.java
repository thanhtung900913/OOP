package week1.oop;
import java.util.Scanner;
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declare variables
        System.out.print("Enter 1st integer: ");
        int number1 = scan.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = scan.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = scan.nextInt();

        int min = number1;
        int max = number1;
        // compute min
        if(number2 < min){
            min = number2;
        }
        if (number3 < min){
            min = number3;
        }
        // compute max
        if(number2 > max){
            max = number2;
        }
        if (number3 > max){
            max = number3;
        }
        // print sum-product-max-min
        System.out.println("The sum is: "+ (number1+number2+number3));
        System.out.println("The product is: "+ (number1*number2*number3));
        System.out.println("The min is: "+ min);
        System.out.println("The max is: "+ max);
    }
}
