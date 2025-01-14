package week1.oop;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 0−10 or 90−100: ");
        int inNumber = scan.nextInt();
        while (inNumber <0 || (inNumber > 10 && inNumber<90) || inNumber>100){
            System.out.println("Invalid input, try again...");
            inNumber = scan.nextInt();
        }
        System.out.println("You hava enter: "+inNumber);
    }
}
