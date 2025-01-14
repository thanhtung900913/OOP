package week1;
import java.util.Scanner;
public class CaesarCode {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a plaintext string: ");
        String inStr = scan.next().toUpperCase();
        for (int idx = 0; idx < inStr.length(); idx++){
            int old_val = (int) inStr.charAt(idx);
            int new_val=old_val + 3;
            if (new_val > 90){
                new_val = new_val - 90;
            }
            char new_char = (char) new_val;
            System.out.print(new_char);
        }
        System.out.println();
    }
}
