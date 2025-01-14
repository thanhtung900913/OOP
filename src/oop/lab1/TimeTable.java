package week1;

import java.util.Scanner;
public class TimeTable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        for (int i = -1; i <= size; i++){
            // print first line
            if (i == -1){
                System.out.printf("%4s","*");
                System.out.printf("%4s","|");
                for (int j = 1; j <= size; j++){
                    System.out.printf("%4d",j);
                }
            }
            //Print second line
            else if (i == 0){
                for (int j = 1; j <= size + 6; j ++){
                    System.out.print("-- ");
                }
            }
            //
            else{
                System.out.printf("%4d",i);
                System.out.printf("%4s","|");
                for (int j = 1; j <= size; j++){
                    System.out.printf("%4d",j*i);
                }
            }
            System.out.println();
        }
    }
}
