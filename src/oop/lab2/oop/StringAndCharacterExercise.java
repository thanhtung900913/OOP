package week2.oop;
import java.util.Scanner;
public class StringAndCharacterExercise {
    public static void main(String[] args) {
        testReverseString();
        testCountVowelsDigits();
        testCipherCaesarCode();
        testHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
        testPhoneKeyPad();
        testDecipherCaesarCode();
    }

    // Ex 1.1:
    public static String reverseString(String inStr) {
        int inStrLen = inStr.length();
        String rev_String = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx -= 1) {
            rev_String += inStr.charAt(charIdx);
        }
        return rev_String;
    }

    //
    public static void testReverseString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        System.out.print("The reverse of the String \"" + inStr + "\" is \"");
        System.out.print(reverseString(inStr));
        System.out.print("\"");
    }

    // Ex 1.2:
    public static int countVowels(String inStr) {
        char[] arr = {'u', 'e', 'o', 'a', 'i'};
        int vowel = 0;
        for (int i = 0; i < inStr.length(); i++) {
            for (char ch : arr) {
                if (inStr.charAt(i) == ch) {
                    vowel += 1;
                }
            }
        }
        return vowel;
    }
    public static int countDigits(String inStr){
        int digit = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isDigit(inStr.charAt(i))){
                digit +=1;
            }
        }
        return digit;
    }

    public static void testCountVowelsDigits(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.next().toLowerCase();

        int vowel = countVowels(inStr);
        int digit = countDigits(inStr);
        float percent_vowel = ((float) vowel/inStr.length())*100;
        float percent_digit = ((float) digit/inStr.length())*100;
        System.out.printf("Number of vowels : %d (%.2f%%)\n",vowel,percent_vowel);
        System.out.printf("Number of vowels : %d (%.2f%%)\n",digit,percent_digit);
    }
    // Ex 1.3:
    public static String phoneKeyPad(String inStr){
        String digit_String = " ";
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++){
            int digit = 0;
            switch (inStr.charAt(charIdx)){
                case 'a' : case 'b' : case 'c': digit = 2 ;break;
                case 'd' : case 'e' : case 'f': digit = 3 ;break;
                case 'g' : case 'h' : case 'i': digit = 4 ;break;
                case 'j' : case 'k' : case 'l': digit = 5 ;break;
                case 'm' : case 'n' : case 'o': digit = 6 ;break;
                case 'p' : case 'q' : case 'r': case 's':digit = 7 ;break;
                case 't' : case 'u' : case 'v': digit = 8 ;break;
                case 'w' : case 'x' : case 'y':case 'z': digit = 9 ;break;
            }
            digit_String += Integer.toString(digit);
        }
        return digit_String;
    }
    public static void testPhoneKeyPad(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.next().toLowerCase();
        System.out.println(phoneKeyPad(inStr));
    }

    // Ex 1.4:
    public static String cipherCaesarCode(String inStr){
        String code = "";
        for (int idx = 0; idx < inStr.length(); idx++){
            int old_val = (int) inStr.charAt(idx);
            int new_val=old_val + 3;
            if (new_val > 90){
                new_val = new_val - 90;
            }
            char new_char = (char) new_val;
            code += new_char;
        }
        return  code;
    }
    public static void testCipherCaesarCode(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String inStr = scan.next().toUpperCase();
        System.out.print("The cipher text string is : ");
        System.out.println(cipherCaesarCode(inStr));
    }

    // Ex 1.5:
    public static String decipherCaesarCode(String inStr){
        String deCode = "";
        for (int idx = 0; idx < inStr.length(); idx++){
            int old_val = (int) inStr.charAt(idx);
            int new_val = old_val-3;
            if (new_val<65){
                new_val -= 3;
            }
            char new_char = (char) new_val;
            deCode += new_char;
        }
        return deCode;
    }
    public static void testDecipherCaesarCode(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ciphertext string: ");
        String inStr = scan.next().toUpperCase();
        System.out.print("The cipher text string is : ");
        System.out.println(decipherCaesarCode(inStr));
    }
    // Ex 1.6:
    public static boolean isHexString(String inStr){
        boolean check = true;
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++){
            if (!((inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx)<= '9')
                    || (inStr.charAt(charIdx) >= 'A' && inStr.charAt(charIdx) <= 'F')
                    || (inStr.charAt(charIdx) >= 'a' && inStr.charAt(charIdx) <= 'f'))){
                check = false;
                break;
            }

        }
        return check;
    }
    public static void testHexString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        if (isHexString(inStr)){
            System.out.println("\""+inStr+"\" is a hexString");
        }else {
            System.out.println("\""+inStr+"\" is NOT a hexString");
        }
    }

    // Ex 1.7:
    public static int binaryToDecimal(String binStr) {
        int result = 0;

        // Kiểm tra xem chuỗi chỉ chứa các ký tự '0' hoặc '1' không
        for (int i = 0; i < binStr.length(); i++) {
            char digitChar = binStr.charAt(i);
            if (digitChar != '0' && digitChar != '1') {
                throw new IllegalArgumentException("error: Invalid binary string: \""+binStr+"\"");
            }
        }

        // Chuyển đổi từ nhị phân sang thập phân
        for (int i = 0; i < binStr.length(); i++) {
            int digit = Character.getNumericValue(binStr.charAt(binStr.length() - i - 1));
            result += digit * Math.pow(2, i);
        }

        return result;
    }

    public static void testBinaryToDecimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        System.out.println(binaryToDecimal(inStr));
    }
    // Ex 1.8:
    public static int hexadecimalToDecimal(String hexStr) {
        int result = 0;
        for (int i = 0; i < hexStr.length(); i++) {
            char digitChar = hexStr.charAt(hexStr.length() - i - 1); // Bắt đầu từ cuối chuỗi
            int digitValue;
            switch (digitChar) {
                case '0':
                    digitValue = 0;
                    break;
                case '1':
                    digitValue = 1;
                    break;
                case '2':
                    digitValue = 2;
                    break;
                case '3':
                    digitValue = 3;
                    break;
                case '4':
                    digitValue = 4;
                    break;
                case '5':
                    digitValue = 5;
                    break;
                case '6':
                    digitValue = 6;
                    break;
                case '7':
                    digitValue = 7;
                    break;
                case '8':
                    digitValue = 8;
                    break;
                case '9':
                    digitValue = 9;
                    break;
                case 'A':
                case 'a':
                    digitValue = 10;
                    break;
                case 'B':
                case 'b':
                    digitValue = 11;
                    break;
                case 'C':
                case 'c':
                    digitValue = 12;
                    break;
                case 'D':
                case 'd':
                    digitValue = 13;
                    break;
                case 'E':
                case 'e':
                    digitValue = 14;
                    break;
                case 'F':
                case 'f':
                    digitValue = 15;
                    break;
                default:
                    throw new IllegalArgumentException("Ký tự không hợp lệ trong chuỗi hệ thập lục phân.");
            }
            result += digitValue * Math.pow(16, i);
        }
        return result;
    }
    public static void testHexadecimalToDecimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        System.out.println(hexadecimalToDecimal(inStr));
    }
    // Ex 1.9:
    public static int octalToDecimal(String binStr) {
        int result = 0;

        // Kiểm tra xem chuỗi chỉ chứa các ký tự '0' hoặc '1' không
        for (int i = 0; i < binStr.length(); i++) {
            char digitChar = binStr.charAt(i);
            if (digitChar > '7' || digitChar < '0') {
                throw new IllegalArgumentException("error: Invalid octal string: \"" + binStr + "\"");
            }
        }

        // Chuyển đổi từ nhị phân sang thập phân
        for (int i = 0; i < binStr.length(); i++) {
            int digit = Character.getNumericValue(binStr.charAt(binStr.length() - i - 1));
            result += digit * Math.pow(8, i);
        }
        return result;
    }
    public static void testOctalToDecimal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        System.out.println(octalToDecimal(inStr));
    }
}
