package test.numbersystem;

import java.math.BigInteger;

public class HexadecimalConverter extends AbstractNumberConverter {
    public HexadecimalConverter(OriginalNumber originalNumber) {
        super(originalNumber);
    }

    /**
     * Chuyển đổi một số được biểu diễn trong hệ cơ số 10
     * sang số được biểu diễn trong hệ cơ số 16.
     * @param decimal
     * @return xâu ký tự biểu diễn số trong hệ cơ số 16.
     *
     * Yêu cầu: sử dụng thuật toán Euclid để chuyển đổi,
     * không sử dụng thư viện chuyển đổi số có sẵn của Java.
     */
    @Override
    public String decimalTo(String decimal) {
        BigInteger decimalValue = new BigInteger(decimal);
        StringBuilder hexString = new StringBuilder();

        BigInteger sixteen = BigInteger.valueOf(16);
        while (decimalValue.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = decimalValue.mod(sixteen);
            char hexChar = Character.forDigit(remainder.intValue(), 16);
            hexString.insert(0, hexChar);
            decimalValue = decimalValue.divide(sixteen);
        }

        return hexString.toString();
    }

    /**
     * Cập nhật số được chuyển đổi khi số ban đầu thay đổi
     * hoặc cơ số của số ban đầu thay đổi. Sau đó in ra terminal
     * số được chuyển đổi theo định dạng a1a2...an(16).
     */
    @Override
    public void update() {
        convert();
        display();
    }

    /**
     * Hiển thị số ra terminal theo định dạng a1a2...an(16).
     */
    @Override
    public void display() {
        System.out.println("Hexadecimal: " + convertedNumber);
    }
}
