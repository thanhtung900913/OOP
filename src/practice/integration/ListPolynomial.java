package practice.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
       if(index < 0 || index > coefficients.size()){
           throw new ArrayIndexOutOfBoundsException();
       }
       return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] newArr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            newArr[i] = coefficients.get(i);
        }
        return newArr;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
       return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, coefficients.length()] thì không thêm được.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
       if(index < 0 || index > coefficients.size()){
           throw new ArrayIndexOutOfBoundsException();
       }
       coefficients.add(index, coefficient);
       return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
       if(index < 0 || index > coefficients.size()){
           throw new ArrayIndexOutOfBoundsException();
       }
       coefficients.set(index, coefficient);
       return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i)*Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial newArr = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            newArr.append(i*coefficients.get(i));
        }
        return newArr;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxLength = Math.max(another.coefficients.size(), coefficients.size());
        ListPolynomial newArr = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coff1;
            double coff2;
            if(i > another.coefficients.size()-1){
                coff2=0;
            }else {
                coff2 = another.coefficient(i);
            }
            if(i > coefficients.size()-1){
                coff1=0;
            }else {
                coff1 = this.coefficient(i);
            }
            newArr.append(coff1+coff2);
        }
        return newArr;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int max = Math.max(another.coefficients.size(), coefficients.size());
        ListPolynomial arr = new ListPolynomial();
        for (int i = 0; i < max; i++) {
            double coef1;
            double coef2;
            if(i > another.coefficients.size()-1){
                coef1 = 0;
            }else {
                coef1 = another.coefficients.get(i);
            }
            if(i > coefficients.size()-1){
                coef2 = 0;
            }else {
                coef2 = another.coefficients.get(i);
            }
            arr.append(coef2-coef1);
        }
        return arr;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int degree = another.coefficients.size()+coefficients.size()-1;
        ListPolynomial result = new ListPolynomial();
        double[] arr = new double[degree];
        for (int i = 0; i < another.coefficients.size(); i++) {
            for (int j = 0; j < coefficients.size(); j++) {
                arr[i+j] += another.coefficients.get(i)*coefficients.get(j);
            }
        }
        for (int i = 0; i < degree; i++) {
            result.append(arr[i]);
        }
        return result;
    }
}
