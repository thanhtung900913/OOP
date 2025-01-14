package week3.oop;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = in.nextInt();
        //squarePattern(n);
        //checkerPattern(n);
        timeTable(n);
    }
    // Ex 2.1
    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            // inner loop to print each of the columns
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    // Ex 2.2
    public static void checkerPattern(int n){
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(" ");
            }
            // Inner loop to print each of the columns
            for (int j = 1; j <= n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // Ex 2.3
    public static void timeTable(int n){
        for (int i = -1; i <= n; i++){
            // print first line
            if (i == -1){
                System.out.printf("%4s","*");
                System.out.printf("%4s","|");
                for (int j = 1; j <= n; j++){
                    System.out.printf("%4d",j);
                }
            }
            //Print second line
            else if (i == 0){
                for (int j = 1; j <= n + 6; j ++){
                    System.out.print("-- ");
                }
            }
            //
            else{
                System.out.printf("%4d",i);
                System.out.printf("%4s","|");
                for (int j = 1; j <= n; j++){
                    System.out.printf("%4d",j*i);
                }
            }
            System.out.println();
        }
    }

    // Ex 2.5
    public static void triangularPatternX(int n){
        // a
        // outer loop to print each rows
        for (int i = 1; i <= n; i++){
            // inner loop to print each columns
            for (int j = 1; j <= n; j++){
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
        for (int i = 1; i <= n; i++){
            // inner loop to print each columns
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        // c
        // outer loop to print each rows
        for (int i = 1; i <= n; i++){
            // inner loop to print each columns
            for (int j = 1; j <= n; j++){
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
        for (int i = 1; i <= n; i++){
            // inner loop to print each columns
            for (int j = 1; j <= n; j++){
                if (j >= n-i+1){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ex 2.5
    public static void boxPatternX(int n){
        // a
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n ; j++){
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // c
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n ; j++){
                if (i == 1 || j + i== n + 1 || i == n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // b
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n ; j++){
                if (i == 1 || j == i || i == n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // d
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n ; j++){
                if (i == 1 || j == i || j + i == n + 1 || i == n){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ex 2.6
    public static void hillPatternX(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n + row -1; col++){
                if (col <= n+row-1 && col >= n -row +1){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // B
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n*2 - row; col++){
                if(col <= n*2 - row && col >= row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // C
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n + row -1; col++){
                if (col <= n+row-1 && col >= n -row +1){
                    System.out.print("#");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= n; row++){
            for (int col = 1; col <= n*2 - row; col++){
                if(col <= n*2 - row && col >= row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // D
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n*2 -1; col++){
                if (col <= n - row + 1 || col >= n + row - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= n; row++){
            for (int col = 1; col <= n*2 -1; col++){
                if (col <= row || col >= n*2 - row){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ex 2.7

}
