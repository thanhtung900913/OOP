package lab5.ex1_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }

    }
    public int getDegree(){
        return this.coeffs.length - 1;
    }

    public String toString(){
        for (int i = 0; i < coeffs.length-1; i++) {
            System.out.print(coeffs[i]+"x^"+(this.getDegree()-i));
            System.out.print(" + ");
        }
        return coeffs[coeffs.length-1]+" ";
    }
    public double evaluate(double x){
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result+= coeffs[i]*Math.pow(x,this.getDegree()-i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right){
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i]+=right.coeffs[i];
        }
        return this;
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] result_arr = new double[right.getDegree()+this.getDegree()+1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                result_arr[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        }
       MyPolynomial result = new MyPolynomial(result_arr);
       return result;
    }
}
