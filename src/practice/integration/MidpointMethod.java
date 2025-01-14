package practice.integration;

public class MidpointMethod extends AbstractIntegrator {
    public MidpointMethod(double precision, int maxIterations) {
        super(precision, maxIterations);
    }

    @Override
    public double integrate(Polynomial polynomial, double lower, double upper) {
        int n = 1;
        double I_n = integrate(polynomial, lower, upper, n);
        double I_2n = integrate(polynomial, lower, upper, n * 2);

        int iterations = 1;

        while (Math.abs(I_2n - I_n) / 3.0 >= precision && iterations < maxIterations) {
            n *= 2;
            I_n = I_2n;
            I_2n = integrate(polynomial, lower, upper, n * 2);
            iterations++;
        }

        return I_2n;
    }

    private double integrate(Polynomial polynomial, double lower, double upper, int numOfSubIntervals) {
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i < numOfSubIntervals; i++) {
            double xMid = lower + (i + 0.5) * intervalWidth;
            sum += polynomial.evaluate(xMid);
        }

        return sum * intervalWidth;
    }
}
