package week3.oop;
import java.util.Scanner;
public class MathLibraryHomework {
    //EX5.1
    public static double sin (double x , int numTerms){
        double Sum=x,index=x;
        int sight = -1;
        for(int i=3;i<=numTerms;i=i+2){
            index = index * x * x / (i*(i-1));
            Sum+=index*sight;
            sight*=-1;
        }
        return Sum;
    }
    public static double cos (double x , int numTerms){
        double Sum=1,index=1;
        int sight = -1;
        for(int i=2;i<=numTerms;i=i+2){
            index = index * x * x / (i*(i-1));
            Sum+=index*sight;
            sight*=-1;
        }
        return Sum;
    }
    //EX5.2
    public static double cpecialSeries (double x , int numTerms){
        double Sum = x, index=x;
        for(int i=3;i<=numTerms;i+=2){
            index *= x * x * (i-2) * (i-2) / ((i-1) *i);
            Sum+=index;
        }
        return Sum;
    }
    //EX5.3
    public static void factorialInt(){
        int Max=Integer.MAX_VALUE;
        long Sum=1;
        int i=1;
        while (Sum <= Max){
            System.out.println("The factorial of " + i + " is "+ Sum);
            i++;
            Sum*=i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }
    public static void fibonacciInt(){
        long f0=1,f1=1;
        long Sum=2;
        long Max = Integer.MAX_VALUE;
        int i=2;
        System.out.println("F[0] = 1");
        System.out.println("F[1] = 1");
        System.out.println("F[2] = 2");
        while (Sum <= Max){
            f0=Sum;
            Sum+=f1;
            f1=f0;
            System.out.println("F["+i+"] = "+Sum);
            i++;
        }
        System.out.println("["+i+"] is out of the range of int ");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.print("Enter numTerms: ");
        int numTerms = in.nextInt();
        System.out.println("sin ( "+x+" ) = " + sin(x,numTerms));
        System.out.println("Gia tri chinh xac sin: " + Math.sin(x));
        System.out.println("cos ( "+x+" ) = " + cos(x,numTerms));
        System.out.println("Gia tri chinh xac cos: " + Math.cos(x));
        System.out.println(cpecialSeries(x,numTerms));
        factorialInt();
        fibonacciInt();
    }

}
