package week1.oop;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 15423;
        int currentDigit;
        while (number >= 1  ){
            currentDigit = number % 10;
            System.out.print(currentDigit+" ");
            number = number/10;
        }
    }
}
