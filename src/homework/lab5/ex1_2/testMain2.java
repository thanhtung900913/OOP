package lab5.ex1_2;

public class testMain2 {
    public static void main(String[] args) {
        // Create polynomials
        MyPolynomial poly1 = new MyPolynomial(1, 2, 3);
        MyPolynomial poly2 = new MyPolynomial(0, 1, -1, 1);

        // Print polynomials
        System.out.println("Polynomial 1: " + poly1.toString());
        System.out.println("Polynomial 2: " + poly2.toString());

        // Calculate and print degrees
        System.out.println("Degree of Polynomial 1: " + poly1.getDegree());
        System.out.println("Degree of Polynomial 2: " + poly2.getDegree());

        // Evaluate polynomials at x = 2
        double x = 2;
        System.out.println("Polynomial 1 evaluated at x = " + x + ": " + poly1.evaluate(x));
        System.out.println("Polynomial 2 evaluated at x = " + x + ": " + poly2.evaluate(x));

        // Add polynomials
        MyPolynomial sum = poly1.add(poly2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum.toString());

        // Multiply polynomials
        MyPolynomial product = poly1.multiply(poly2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product.toString());
    }
}
