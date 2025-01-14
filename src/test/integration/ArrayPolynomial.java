package test.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficients;
    private int length;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.length = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if (index >= 0 && index < length) {
            return coefficients[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds for coefficients array.");
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[length];
        System.arraycopy(coefficients, 0, coeffsArray, 0, length);
        return coeffsArray;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (length == coefficients.length) {
            enlarge();
        }
        coefficients[length++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, length] thì không thêm được.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > length) {
            return this;
        }
        if (length == coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, length - index);
        coefficients[index] = coefficient;
        length++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index >= 0 && index < length) {
            coefficients[index] = coefficient;
        }
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return length - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = length - 1; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        if (length <= 1) {
            return new ArrayPolynomial(); // derivative of a constant or zero polynomial is zero
        }
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < length; i++) {
            derivative.append(i * coefficients[i]);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxLength = Math.max(this.length, another.length);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coef1 = i < this.length ? this.coefficients[i] : 0.0;
            double coef2 = i < another.length ? another.coefficients[i] : 0.0;
            result.append(coef1 + coef2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxLength = Math.max(this.length, another.length);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coef1 = i < this.length ? this.coefficients[i] : 0.0;
            double coef2 = i < another.length ? another.coefficients[i] : 0.0;
            result.append(coef1 - coef2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newLength = this.length + another.length - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < newLength; i++) {
            result.append(0.0);
        }
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < another.length; j++) {
                result.coefficients[i + j] += this.coefficients[i] * another.coefficients[j];
            }
        }
        result.length = newLength;
        return result;
    }

    /**
     * Tăng kích thước gấp đôi để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] newCoefficients = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newCoefficients, 0, coefficients.length);
        coefficients = newCoefficients;
    }
}
