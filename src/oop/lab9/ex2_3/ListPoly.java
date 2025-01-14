package oop.lab9.ex2_3;
import java.util.ArrayList;
import java.util.List;
public class ListPoly extends AbstractPoly{
    List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() -1;
    }

    @Override
    public Poly derivative() {
        return null;
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            return 0; // Return 0 for degrees out of range
        }
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }

    @Override
    double[] derive() {
        double[] derivativeCoefficients = new double[coefficients.size() - 1];
        for (int i = 1; i < coefficients.size(); i++) {
            derivativeCoefficients[i - 1] = coefficients.get(i) * i;
        }
        return derivativeCoefficients;
    }
}
