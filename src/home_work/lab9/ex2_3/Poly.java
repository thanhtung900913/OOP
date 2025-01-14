package home_work.lab9.ex2_3;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient(int degree);
    double[] coefficients();

}
