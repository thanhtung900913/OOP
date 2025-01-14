package test.numbersystem;

import java.util.Random;

public class NumberSystemTestDrive {
    public static void main(String[] args) {
        // Sinh ngẫu nhiên 3 số và cơ số radix
        Random random = new Random();
        int[] radixArr = {2,8,16};
        for (int i = 0; i < 3; i++) {
            int radix = radixArr[i];
            int length = random.nextInt(10) ; // Độ dài số trong đoạn [10, 30]

            StringBuilder numberBuilder = new StringBuilder();
            for (int j = 0; j < length; j++) {
                int digitIndex = random.nextInt(radix);
                numberBuilder.append(Integer.toString(digitIndex, radix).toUpperCase());
            }


            String number = numberBuilder.toString();
            System.out.println(number);
            // Tạo đối tượng OriginalNumber
            OriginalNumber originalNumber = new OriginalNumber(number, radix);
            System.out.println("Original number: " + number);
            // Tạo đối tượng của lớp chuyển đổi tương ứng
            AbstractNumberConverter converter;
            AbstractNumberConverter converter1;
            AbstractNumberConverter converter2;
            converter1 = new BinaryConverter(originalNumber);
            converter1.update();
            System.out.println();

            converter = new HexadecimalConverter(originalNumber);
            converter.update();
            System.out.println();

            converter2 = new OctalConverter(originalNumber);
            converter2.update();
            // Cập nhật và hiển thị số đã được chuyển đổi

        }
    }
}
