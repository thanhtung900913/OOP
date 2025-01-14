package week1;

import java.util.Scanner;
public class HillPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scan.nextInt();
        //A
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size + row -1; col++){
                if (col <= size+row-1 && col >= size -row +1){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // B
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size*2 - row; col++){
                if(col <= size*2 - row && col >= row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // C
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size + row -1; col++){
                if (col <= size+row-1 && col >= size -row +1){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++){
            for (int col = 1; col <= size*2 - row; col++){
                if(col <= size*2 - row && col >= row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // D
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size*2 -1; col++){
                if (col <= size - row + 1 || col >= size + row - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++){
            for (int col = 1; col <= size*2 -1; col++){
                if (col <= row || col >= size*2 - row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
