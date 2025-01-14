package week1;

import java.util.Scanner;
public class CheckerPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        // Outer loop to print each of the rows
        for (int i = 1; i <= size; i++){
            if (i % 2 == 0){
                System.out.print(" ");
                }
            // Inner loop to print each of the columns
            for (int j = 1; j <= size; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
