package week1.oop;
/*
    print factorial of n
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 20;
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial =factorial*i;
        }
        System.out.println("The factorial of "+n+" is "+factorial);
    }
}
