package practice.integration;

public class SimpsonMethod extends AbstractIntegrator {
    public SimpsonMethod(double precision, int maxIterations) {
        super(precision, maxIterations);
    }

    @Override
    public double integrate(Polynomial polynomial, double lower, double upper) {
        int n = 2;  // Simpson's rule requires at least 2 intervals
        double I_n = integrate(polynomial, lower, upper, n);
        double I_2n = integrate(polynomial, lower, upper, n * 2);

        int iterations = 1;

        while (Math.abs(I_2n - I_n) / 15.0 >= precision && iterations < maxIterations) {
            n *= 2;
            I_n = I_2n;
            I_2n = integrate(polynomial, lower, upper, n * 2);
            iterations++;
        }

        return I_2n;
    }

    private double integrate(Polynomial polynomial, double lower, double upper, int numOfSubIntervals) {
        if (numOfSubIntervals % 2 != 0) {
            throw new IllegalArgumentException("numOfSubIntervals must be even.");
        }

        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = polynomial.evaluate(lower) + polynomial.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * intervalWidth;
            if (i % 2 == 0) {
                sum += 2 * polynomial.evaluate(x);
            } else {
                sum += 4 * polynomial.evaluate(x);
            }
        }

        return sum * intervalWidth / 3.0;
    }
}
