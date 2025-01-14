package week3_2;

import java.util.Scanner;

public class exercisesOnRecurson {
    public static void main(String[] args) {
        testFactorial();
        testFibonacci();
        testLength();
    }
    // Ex 1.1
    public static int factorial(int n){
        if(n== 0){
            return 1;
        }
        return factorial(n-1)*n;
    }

    public static void testFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of "+number+" is: "+factorial(number));
    }
    //Ex 1.2
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        return fibonacci(n-1)+factorial(n-2);
    }

    public static void testFibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci bumber at "+number+" is: "+fibonacci(number));
    }
    // Ex 1.3
    public static int len(int n){
        if(n == 1){
            return 1;
        }
        return len(n-1)+numOfDigit(n);
    }

    public static int numOfDigit(int n){
        int count = 0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void testLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Length of "+number+" is: "+len(number));
    }
    // Ex 1.4:

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,remainder(a,b));
    }

    public static int remainder(int a, int b){
        return a%b;
    }

}
