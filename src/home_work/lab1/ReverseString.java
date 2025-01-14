package week1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.nextLine();
        int inStrLen = inStr.length();
        System.out.print("The reverse of the String \"" + inStr + "\" is \"");
        for (int charIdx = inStrLen-1; charIdx >= 0; charIdx -= 1){
            System.out.print(inStr.charAt(charIdx));
        }
        System.out.print("\"");
    }
}
