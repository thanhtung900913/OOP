package week1;
import java.util.Scanner;
import java.util.ArrayList;
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.next().toLowerCase();
        char[] arr = {'u', 'e', 'o', 'a', 'i'};
        int vowel = 0;
        int digit = 0;
        for (int i = 0; i < inStr.length(); i++) {
            for (char ch : arr ) {
                if (inStr.charAt(i) == ch) {
                    vowel += 1;
                }
            }
            if (Character.isDigit(inStr.charAt(i))){
                digit +=1;
            }
        }
        float percent_vowel = ((float) vowel/inStr.length())*100;
        float percent_digit = ((float) digit/inStr.length())*100;
        System.out.printf("Number of vowels : %d (%.2f%%)\n",vowel,percent_vowel);
        System.out.printf("Number of vowels : %d (%.2f%%)\n",digit,percent_digit);
    }
}