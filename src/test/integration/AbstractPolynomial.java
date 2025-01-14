package test.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        double[] coeffs = coefficients();
        for (int i = 0; i < coeffs.length; i++) {
            if (i > 0 && coeffs[i] >= 0) {
                sb.append(" + ");
            } else if (i > 0) {
                sb.append(" ");
            }
            if (i == 0 || coeffs[i] != 1) {
                sb.append(coeffs[i]);
            }
            if (i > 0) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coeffs = coefficients();
        if (coeffs.length <= 1) {
            return new double[]{0.0}; // Derivative of a constant is 0
        }
        double[] derivativeCoeffs = new double[coeffs.length - 1];
        for (int i = 1; i < coeffs.length; i++) {
            derivativeCoeffs[i - 1] = i * coeffs[i];
        }
        return derivativeCoeffs;
    }

    /**
     * Abstract method to be implemented by concrete subclasses to provide the coefficients of the polynomial.
     * @return mảng các hệ số của đa thức.
     */
    public abstract double[] coefficients();
}
