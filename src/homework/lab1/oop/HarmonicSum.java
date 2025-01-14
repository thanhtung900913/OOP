package week1.oop;
/*
    Compute the sum of harmonics series from left-to-right and right-to-left.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        // for−loop for summing from left−to−right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++){
            sumL2R += (double) 1/denominator;
        }
        System.out.println("The sum from left-to-right is: "+sumL2R);
        // for−loop for summing from right−to−left
        for (int denominator = MAX_DENOMINATOR; denominator >=1 ; denominator--){
            sumR2L += (double) 1/denominator;
        }
        System.out.println("The sum from left-to-right is: "+sumR2L);
        // Find the absolute difference and display
        if (sumL2R > sumR2L){
            double diffSum = sumL2R-sumR2L;
            System.out.println("The absolute difference is :"+diffSum);
        } else {
            double diffSum = sumR2L-sumL2R;
            System.out.println("The absolute difference is :"+diffSum);
        }
    }
}
