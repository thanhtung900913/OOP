package practice.fraction;

public class Fraction implements FractionComparable {
    private int numerator;
    private int denominator;

    /**
     * Hàm dựng khởi tạo giá trị mặc định là 1/1.
     */
    public Fraction() {
        /* TODO */
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Hàm dựng khởi tạo giá trị cho tử số và mẫu số.
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        /* TODO */
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Hàm dựng copy, copy giá trị của phân số truyền vào.
     * @param copyFraction
     */
    public Fraction(Fraction copyFraction) {
        /* TODO */
        this.numerator = copyFraction.getNumerator();
        this.denominator = copyFraction.getDenominator();
    }

    public int getNumerator() {
        /* TODO */
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        /* TODO */
        this.numerator = numerator;
    }

    public int getDenominator() {
        /* TODO */
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        /* TODO */
        this.denominator = denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu byte của phân số.
     * @return
     */
    public byte byteValue() {
        /* TODO */
        return (byte)(numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu int của phân số.
     * @return
     */
    public int intValue() {
        /* TODO */
        return (int)(numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu long của phân số.
     * @return
     */
    public long longValue() {
        /* TODO */
        return (long)(numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu short của phân số.
     * @return
     */
    public short shortValue() {
        /* TODO */
        return (short) (numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu double của phân số.
     * @return
     */
    public double doubleValue() {
        /* TODO */
        return (double) (numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu float của phân số.
     * @return
     */
    public float floatValue() {
        /* TODO */
        return (float) (numerator / denominator);
    }

    /**
     * Phương thức tính ước số chung lớn nhất của tử số và mẫu số.
     * @return ước số chung lớn nhất của tử số và mẫu số.
     */
    private int gcd() {
        /* TODO */
        int gcd = 1;
        for (int i = 1; i <= Math.min(denominator, numerator); i++) {
            if(gcd < i){
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Phương thức rút gọn phân số về phân số tối giản.
     */
    public void simplify() {
        /* TODO */
        this.numerator = numerator/ gcd();
        this.denominator = denominator/gcd();
    }

    @Override
    public int compareTo(Fraction another) {
        /* TODO */
        return Double.compare(this.doubleValue(), another.doubleValue());
    }

    /**
     * Phương thức mô tả phân số theo định dạng numerator/denominator;
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        return this.numerator+"/"+denominator+" ";
    }
}
