package week1;
import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = scan.next().toLowerCase();

 //ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).

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
            System.out.print(digit);
        }
        System.out.println();
    }
}
