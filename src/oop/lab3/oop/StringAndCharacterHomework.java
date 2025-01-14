package week3.oop;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // testExchangeCipher(in);
        testPalindromicWord(in);
    }

    // Ex 3.1
    public static String exchangeCipher(String inStr){
        inStr = inStr.toUpperCase();
        String result = "";
        for (int i = 0; i < inStr.length(); i++){
            result += (char) (155 - (int) inStr.charAt(i));
        }
        return result;
    }

    public static void testExchangeCipher(Scanner in){
        System.out.print("Enter a plaintext String: ");
        String inStr = in.nextLine();
        String result = exchangeCipher(inStr);
        System.out.print("The cipher text string is: "+result);
    }

    // Ex 3.2
    public static boolean isPalindromicWord(String inStr) {
        inStr = inStr.toLowerCase();
        for (int fIdx = 0, bIdx = inStr.length() - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            // Loại bỏ các ký tự không phải là chữ cái
            while (!Character.isLetter(inStr.charAt(fIdx))) {
                fIdx++;
            }
            while (!Character.isLetter(inStr.charAt(bIdx))) {
                bIdx--;
            }

            // Nếu hai ký tự không giống nhau, không phải là palindrome
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
        }
        return true;
    }


    public static void testPalindromicWord(Scanner in){
        System.out.print("Enter a String: ");
        String inStr = in.nextLine();
        if(isPalindromicWord(inStr)){
            System.out.print("\""+inStr+"\" is a PalindromicWord");
        }else {
            System.out.print("\""+inStr+"\" is not a PalindromicWord");
        }

    }
}
