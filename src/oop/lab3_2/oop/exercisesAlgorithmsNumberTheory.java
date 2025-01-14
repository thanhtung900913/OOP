package week3_2;

import java.util.Scanner;

public class exercisesAlgorithmsNumberTheory {
    public static void main(String[] args) {
        PerfectNumberList();
        primeList();
        PerfectPrimeFactorList();
        System.out.println(gcd(9,3));

    }
    // Ex 3.1
    public static boolean isPerfect(int aPosInt){
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if(aPosInt % i == 0){
                sum+= i;
            }
        }
        if (sum == aPosInt){
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt){
        int sum = 1;
        for (int i = 2; i < aPosInt; i++) {
            if(aPosInt % i == 0){
                sum+= i;
            }
        }
        if (sum < aPosInt){
            return true;
        }
        return false;
    }
    public static void PerfectNumberList(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();
        int countPefect = 0;
        int countDeficient = 0;
        System.out.println("These numbers are prefect: ");
        for (int i = 1; i < upper; i++) {
            if(isPerfect(i)){
                countPefect++;
                System.out.print(i+" ");
            }
        }
        float pRate = (float) countPefect/upper *100;
        System.out.println();
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n",countPefect,pRate);

        System.out.println("These numbers are deficient nor perfect: ");
        for (int i = 1; i < upper; i++) {
            if(!(isDeficient(i) || isPerfect(i))){
                countDeficient++;
                System.out.print(i+" ");
            }
        }
        float dRate = (float) countDeficient/upper *100;
        System.out.println();
        System.out.printf("[%d deficient numbers found (%.2f%%)]\n",countDeficient,dRate);
        System.out.println();
    }
    // Ex 3.2:
    public static boolean isPrime(int aPosInt){
        if (aPosInt <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt);i++){
            if(aPosInt%i == 0){
                return false;
            }
        }
        return true;

    }

    public static void primeList(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter upper number: ");
        int upper = scanner.nextInt();
        for (int i = 0; i <= upper; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        float pRate = (float) count/upper *100;
        System.out.printf("[%d prime numbers found (%.2f%%)]\n",count,pRate);
        System.out.println();
    }
    // Ex 3.3:
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int sum = 1;
        if(aPosInt <= 2){
            return false;
        }
        for (int i = 2; i < aPosInt; i++) {
            if(isPrime(i) && aPosInt % i == 0){
                sum*=i;
            }
        }
        // System.out.println(sum);
        if(sum == aPosInt){
            return true;
        }
        return false;
    }
    public static void PerfectPrimeFactorList(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter upper number: ");
        int upper = scanner.nextInt();
        System.out.println("These number are equals to the product of prime factor: ");
        for (int i = 0; i <= upper; i++) {
            if(isProductOfPrimeFactors(i)){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        float rate = (float) count/upper *100;
        System.out.printf("[%d numbers found (%.2f%%)]\n",count,rate);
    }
    // Ex 3.4:
    public static int gcd(int a, int b){
        while (b != 0){
            int tmp =b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
}
