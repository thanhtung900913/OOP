package week1.oop;
/*
    Compute the sum and average of running integers from a lowerbound to an upperbound using for loop
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;
        for (int number = lowerBound; number <= upperBound; number++){
            sum+= number;
        }
        float average = (float) sum/(upperBound-lowerBound+1);
        System.out.println("The sum of "+lowerBound+" to "+upperBound+" is "+sum);
        System.out.println("The average is "+average);
    }
}
