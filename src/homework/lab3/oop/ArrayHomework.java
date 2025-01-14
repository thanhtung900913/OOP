package week3.oop;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printArrayInStars(in);
    }
    public static void printArrayInStars(Scanner in){
        System.out.print("Enter the number of item: ");
        final int NUM_ITEMS = in.nextInt();
        in.nextLine();
        System.out.print("Enter value of all items: ");
        String input = in.nextLine();

        int[] arr = new int[NUM_ITEMS];
        String[] token = input.split(" ");

        for (int i = 0; i < NUM_ITEMS; i++) {
            arr[i] = Integer.parseInt(token[i]);
        }

        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println("("+arr[i]+")");
        }
    }
}
