package week1.oop;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        // Declare variables
        int inNumber = scan.nextInt();
        int inDigit;
        // Extract and drop the ”last” digit repeatably using a while-loop with modulus/divide operations
        System.out.print("The reverse is: ");
        while (inNumber > 0){
            inDigit = inNumber%10; // extract the ” last ” digit
            System.out.print(inDigit); // Print this digit ( which is extracted in reverse order )
            inNumber=inNumber/10; // drop last "digit" and repeat
        }
    }
}
