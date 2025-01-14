package test.integration;

import java.util.Random;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        System.out.println("Testing Array Polynomial:");
        Random rand = new Random();
        int degree = rand.nextInt(10) + 1;
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial();
        for (int i = 0; i <= degree; i++) {
            double coefficient = rand.nextInt(10) + 1;
            arrayPolynomial.append(coefficient);
        }
        System.out.println("Polynomial: " + arrayPolynomial);
        double num = 9.0;
        System.out.println("Test insert");
        arrayPolynomial.insert(num, 0);
        // Testing polynomial functionalities
        System.out.println( arrayPolynomial);
        System.out.println("eveluate: "+arrayPolynomial.evaluate(1));
        System.out.println("test append: "+arrayPolynomial.append(1.0));
        System.out.println( arrayPolynomial.derivative());
        System.out.println("test sum:"+arrayPolynomial.multiply((ArrayPolynomial) arrayPolynomial.derivative()));
        System.out.println("test minus: "+ arrayPolynomial.minus(arrayPolynomial));
        System.out.println("test eveluate: "+ arrayPolynomial.evaluate(2));
        System.out.println("Array Polynomial Test Completed.\n");
    }

    public static void testListPolynomial() {
        System.out.println("Testing List Polynomial:");
        Random rand = new Random();
        int degree = rand.nextInt(10) + 1; // Random degree between 1 and 10
        ListPolynomial listPolynomial = new ListPolynomial();
        // Generating random coefficients and appending to the polynomial
        for (int i = 0; i <= degree; i++) {
            double coefficient = rand.nextInt(10) + 1; // Random coefficient between 1 and 10
            listPolynomial.append(coefficient);
        }
        // Testing polynomial functionalities
        System.out.println("Polynomial: " + listPolynomial);
        // Add more tests as needed
        double num = 9;
        listPolynomial.insert(num, 0);
        // Testing polynomial functionalities
        System.out.println( listPolynomial);
        System.out.println("eveluate: "+listPolynomial.evaluate(1));
        System.out.println( listPolynomial.derivative());
        System.out.println("tong:"+listPolynomial.multiply((ListPolynomial) listPolynomial.derivative()));
        System.out.println("test sum:"+listPolynomial.multiply((ListPolynomial) listPolynomial.derivative()));
        System.out.println("test minus: "+ listPolynomial.minus(listPolynomial));
        System.out.println("test eveluate: "+ listPolynomial.evaluate(2));
        System.out.println("Array Polynomial Test Completed.\n");
        System.out.println("List Polynomial Test Completed.\n");
    }

    public static void testIntegrationCalculator() {
        System.out.println("Testing Integration Calculator:");
        Random rand = new Random();
        int degree = rand.nextInt(10) + 1; // Random degree between 1 and 10
        Polynomial polynomial;
        // Choosing either MyArrayPolynomial or MyListPolynomial randomly
        if (rand.nextBoolean()) {
            polynomial = new ArrayPolynomial();
        } else {
            polynomial = new ListPolynomial();
        }
        // Generating random coefficients and appending to the polynomial
        for (int i = 0; i <= degree; i++) {
            double coefficient = rand.nextInt(10) + 1; // Random coefficient between 1 and 10
            // polynomial.append(coefficient);
        }
        // Choosing integration bounds randomly
        double lower = rand.nextDouble() * 10;
        double upper = lower + rand.nextDouble() * 10;
        // Testing integration calculator
        IntegrationCalculator calculator = new IntegrationCalculator(polynomial);
        // Choosing integration method randomly
        int methodChoice = rand.nextInt(3);
        Integrator integrator;
        switch (methodChoice) {
            case 0:
                integrator = new MidpointMethod(0.0001, 1000);
                System.out.println("Integration Method: Midpoint Method");
                break;
            case 1:
                integrator = new TrapezoidMethod(0.0001, 1000);
                System.out.println("Integration Method: Trapezoid Method");
                break;
            case 2:
                integrator = new SimpsonMethod(0.0001, 1000);
                System.out.println("Integration Method: Simpson Method");
                break;
            default:
                integrator = new MidpointMethod(0.0001, 1000);
        }
        calculator.setIntegrator(integrator);
        double result = calculator.integrate(lower, upper);
        System.out.println("Lower Bound: " + lower);
        System.out.println("Upper Bound: " + upper);
        System.out.println("Integration Result: " + result);
        System.out.println("Integration Calculator Test Completed.\n");
    }
}
