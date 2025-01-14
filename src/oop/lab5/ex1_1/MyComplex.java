package lab5.ex1_1;

public class MyComplex {
    private double real;
    private double imag;
    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        return real + " + "+imag;
    }

    public boolean isReal(){
        if(imag == 0.0){
            return true;
        }
        return false;
    }

    public boolean isImaginary(){
        if(real == 0.0){
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag){
        if(this.real == real && this.imag == imag){
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another){
        if(this.real == another.getReal() && this.imag == another.getImag()){
            return true;
        }
        return false;
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public MyComplex addInto(MyComplex right){
        this.imag += right.getImag();
        this.real += right.getReal();
        return this;
    }
    public MyComplex addNew(MyComplex right){
        MyComplex myComplex = new MyComplex(this.imag + right.getImag(),this.real += right.getReal());
        return myComplex;
    }
}
