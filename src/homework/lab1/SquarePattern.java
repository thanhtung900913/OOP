package week1;

import java.util.Scanner;
public class SquarePattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        // outer loop to print each of the rows
        for (int i = 0; i < size; i++){
            // inner loop to print each of the columns
            for (int j = 0; j < size; j ++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
