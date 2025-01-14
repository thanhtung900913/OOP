package week1;

import java.util.Scanner;
public class BoxPatternX {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scan.nextInt();
        // a
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size ; j++){
                if (i == 1 || j == 1 || i == size || j == size){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // c
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size ; j++){
                if (i == 1 || j + i== size + 1 || i == size){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // b
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size ; j++){
                if (i == 1 || j == i || i == size){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // d
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size ; j++){
                if (i == 1 || j == i || j + i == size + 1 || i == size){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
