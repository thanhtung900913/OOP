package week3.oop;

import java.util.Scanner;

public class DecisionAndLoopsHomework {
    public static void main(String[] args) {
        // guessNumber();
        guessWord();
    }
    // Ex 1.1
    public static void guessNumber(){
        Scanner in = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random()*100);
        guessNumber(SECRET_NUMBER,in);
    }

    public static void guessNumber(int number, Scanner in){
        int attemp = 0;
        System.out.println("Key in your guess: ");
        int key = in.nextInt();
        while (key != number){
            attemp++;
            if(key < number){
                System.out.println("Try higher");
            }else {
                System.out.println("Try lower");
            }
            key = in.nextInt();
        }
        System.out.println("You got it in "+attemp+" trials!");
    }
    // Ex 1.2
    public static void guessWord(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.nextLine();
        guessWord(word, in);
    }

    public static void guessWord(String guessedString, Scanner in){
        int attemp = 0;
        boolean[] arr1 = new boolean[guessedString.length()];
        while (!allTrue(arr1)){
            attemp++;
            System.out.print("Key in one character or your guess word: ");
            String key = in.nextLine();
            if(key.length() == guessedString.length()){
                if (key.equals(guessedString)){
                    break;
                }
            }else {
                for (int i = 0; i < guessedString.length(); i++) {
                    if (key.equals(String.valueOf(guessedString.charAt(i)))){
                        arr1[i] = true;
                    }
                }
                System.out.print("Trial "+attemp+" : ");
                for (int i = 0; i < guessedString.length(); i++) {
                    if (arr1[i]){
                        System.out.print(guessedString.charAt(i));
                    }else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
        System.out.print("You got it in "+attemp+" trials!");
    }
    public static boolean allTrue(boolean[] arr) {
        for (boolean value : arr) {
            if (!value) {
                return false;
            }
        }
        return true;
    }
}
