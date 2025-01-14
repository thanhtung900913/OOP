package oop.lab12.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ArrayPolynomial p1 = new ArrayPolynomial();
        p1.append(1).append(2).append(3);
        System.out.println("p1 = " + p1); // Output: p1 = 1.0 + 2.0x + 3.0x^2

        ArrayPolynomial p2 = new ArrayPolynomial();
        p2.append(4).append(5).append(6);
        System.out.println("p2 = " + p2); // Output: p2 = 4.0 + 5.0x + 6.0x^2

        ArrayPolynomial p3 = p1.plus(p2);
        System.out.println("p1 + p2 = " + p3); // Output: p1 + p2 = 5.0 + 7.0x + 9.0x^2

        ArrayPolynomial p4 = p1.minus(p2);
        System.out.println("p1 - p2 = " + p4); // Output: p1 - p2 = -3.0 + -3.0x + -3.0x^2

        ArrayPolynomial p5 = p1.multiply(p2);
        System.out.println("p1 * p2 = " + p5); // Output: p1 * p2 = 4.0 + 13.0x + 28.0x^2 + 18.0x^3

        System.out.println("p1(2) = " + p1.evaluate(2)); // Output: p1(2) = 11.0
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ListPolynomial p1 = new ListPolynomial();
        p1.append(1).append(2).append(3);
        System.out.println("p1 = " + p1); // Output: p1 = 1.0 + 2.0x + 3.0x^2

        ListPolynomial p2 = new ListPolynomial();
        p2.append(4).append(5).append(6);
        System.out.println("p2 = " + p2); // Output: p2 = 4.0 + 5.0x + 6.0x^2

        ListPolynomial p3 = p1.plus(p2);
        System.out.println("p1 + p2 = " + p3); // Output: p1 + p2 = 5.0 + 7.0x + 9.0x^2

        ListPolynomial p4 = p1.minus(p2);
        System.out.println("p1 - p2 = " + p4); // Output: p1 - p2 = -3.0 + -3.0x + -3.0x^2

        ListPolynomial p5 = p1.multiply(p2);
        System.out.println("p1 * p2 = " + p5); // Output: p1 * p2 = 4.0 + 13.0x + 28.0x^2 + 18.0x^3

        System.out.println("p1(2) = " + p1.evaluate(2)); // Output: p1(2) = 11.0
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        ArrayPolynomial poly = new ArrayPolynomial();
        poly.append(1).append(2).append(3).append(4);

        System.out.println("Polynomial: " + poly);

        double precision = 1e-6;
        int maxIterations = 100;

        Integrator midpointRule = new MidpointRule(precision, maxIterations);
        double midpointResult = midpointRule.integrate(poly, 0, 1);
        System.out.println("Midpoint Rule: " + midpointResult);

        Integrator trapezoidRule = new TrapezoidRule(precision, maxIterations);
        double trapezoidResult = trapezoidRule.integrate(poly, 0, 1);
        System.out.println("Trapezoid Rule: " + trapezoidResult);

        Integrator simpsonRule = new SimpsonRule(precision, maxIterations);
        double simpsonResult = simpsonRule.integrate(poly, 0, 1);
        System.out.println("Simpson Rule: " + simpsonResult);
    }
}
