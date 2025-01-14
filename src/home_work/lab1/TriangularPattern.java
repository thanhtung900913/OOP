package week1;

import java.util.Scanner;
public class TriangularPattern {
    public static void main(String args[]){
        System.out.println("Enter the size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        // a
        // outer loop to print each rows
        for (int i = 1; i <= size; i++){
            // inner loop to print each columns
            for (int j = 1; j <= size; j++){
                if (j <= i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // b
        // outer loop to print each rows
        for (int i = 1; i <= size; i++){
            // inner loop to print each columns
            for (int j = 1; j <= size-i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        // c
        // outer loop to print each rows
        for (int i = 1; i <= size; i++){
            // inner loop to print each columns
            for (int j = 1; j <= size; j++){
                if (i <= j){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // d
        // outer loop to print each rows
        for (int i = 1; i <= size; i++){
            // inner loop to print each columns
            for (int j = 1; j <= size; j++){
                if (j >= size-i+1){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
