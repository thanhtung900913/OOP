package lab5.ex1_3;
import java.math.BigInteger;
public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222");
        System.out.println(i1.add(i2));
    }
}
