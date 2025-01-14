package lab5.ex1_1;

public class testMain1 {
    public static void main(String[] args) {
        MyComplex mc = new MyComplex();
        System.out.println(mc);
        MyComplex mc2 = new MyComplex(3.5,4.2);
        System.out.println(mc2);


        mc.setImag(10);
        System.out.println(mc.getImag());
        mc2.setImag(3);
        System.out.println(mc2.getReal());
        System.out.println(mc.isImaginary());
        System.out.println(mc.isReal());

        System.out.println(mc.equals(mc2));
        System.out.println(mc.addInto(mc2));
        System.out.println(mc.addNew(mc2));


    }
}