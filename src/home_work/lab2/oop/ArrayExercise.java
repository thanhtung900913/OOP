package week2.oop;
import java.util.Scanner;
public class ArrayExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        simpleGradesStatistics(generateStudentGrades(scan));
    }

    // Ex 2.1:
    public static int[] createArray(Scanner in){
        final int NUM_ITEMS;
        int[] items;
        System.out.println("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        in.nextLine();
        items = new int[NUM_ITEMS];
        System.out.println("Enter all the value of items (separated by space): ");
        String input = in.nextLine();
        String[] arr = input.split(" ");
        for (int i = 0; i < items.length; i++){
            items[i] = Integer.parseInt(arr[i]);
        }
        return items;
    }
    public static void printArray(int[] arr){
        System.out.print("The values are: [");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length-1){
                System.out.print(" ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    // Ex 2.2
    public static int[] generateStudentGrades(Scanner in){
        int numStudents;
        int[] grades;

        System.out.println("Enter the number of student: ");
        numStudents = in.nextInt();
        in.nextLine();
        grades = new int[numStudents];
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter the grade for student "+ (i+1)+": ");
            grades[i]=in.nextInt();
        }
        return grades;
    }
    public static void simpleGradesStatistics(int[] arr){
        int minimum = arr[0];
        int maximum = arr[0];
        int sum = 0;
        for(int num : arr){
            if (num < minimum){
                minimum = num;
            }
            if(num > maximum){
                maximum = num;
            }
            sum+= num;
        }
        double average = (double) sum/arr.length;
        System.out.println("Maximum is: "+ maximum);
        System.out.println("Minimum is: "+ minimum);
        System.out.printf("Average is: %.2f\n",average);

    }
    // Ex 2.3:
//    public static String hexadecimalToBinary(String binString){
//        final String[] HEX_BITS = {"0000","0001","0010","0011",
//        "0100","0101","0110","0111",
//        "1000","1001","1010","1011",
//        "1100","1101","1110","1111"};
//        String result ="";
//        for (String a : HEX_BITS){
//            for (int i = 0; i < binString.length(); i++){
//                if()
//            }
//        }
//        return  result;
//
//    }
}
