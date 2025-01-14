package oop.lab12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        double[] coefficients = coefficients();
        int degree = degree();

        for (int i = degree; i >= 0; i--) {
            double coefficient = coefficients[i];
            if (coefficient != 0) {
                if (sb.length() > 0) {
                    if (coefficient > 0) {
                        sb.append(" + ");
                    } else {
                        sb.append(" - ");
                        coefficient = -coefficient;
                    }
                } else if (coefficient < 0) {
                    sb.append("-");
                    coefficient = -coefficient;
                }

                if (i == 0 || coefficient != 1) {
                    sb.append(coefficient);
                }

                if (i > 0) {
                    if (i == 1) {
                        sb.append("x");
                    } else {
                        sb.append("x^").append(i);
                    }
                }
            }
        }

        if (sb.length() == 0) {
            sb.append("0");
        }

        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] coefficients = coefficients();
        int degree = degree();
        double[] derivative = new double[degree];

        for (int i = 1; i <= degree; i++) {
            derivative[i - 1] = i * coefficients[i];
        }

        return derivative;
    }
}
