package test.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial polynomial;

    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     * @param polynomial
     */
    public IntegrationCalculator(Polynomial polynomial) {
        this.polynomial = polynomial;
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     * @param integrator
     * @param polynomial
     */
    public IntegrationCalculator(Integrator integrator, Polynomial polynomial) {
        this.integrator = integrator;
        this.polynomial = polynomial;
    }

    public void setPolynomial(Polynomial polynomial) {
        this.polynomial = polynomial;
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
    }

    public double integrate(double lower, double upper) {
        if (integrator == null) {
            throw new IllegalStateException("Integrator is not set.");
        }
        if (polynomial == null) {
            throw new IllegalStateException("Polynomial is not set.");
        }
        return integrator.integrate(polynomial, lower, upper);
    }
}
