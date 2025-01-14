package cuoiki.fraction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class FractionTestDrive {
    public static void main(String[] args) {
        // 1. Sinh số ngẫu nhiên nằm trong đoạn [30, 50]
        Random random = new Random();
        int numbers = random.nextInt(21) + 30; // Số ngẫu nhiên từ 30 đến 50

        // 2. Tạo ra numbers phân số và lưu vào DataSet
        DataSet dataSet = new DataSet();
        for (int i = 0; i < numbers; i++) {
            int numerator = random.nextInt(100) + 1; // Tử số từ 1 đến 100
            int denominator = random.nextInt(100) + 1; // Mẫu số từ 1 đến 100
            dataSet.append(new Fraction(numerator, denominator));
        }

        // 3. Sắp xếp và in ra tập dữ liệu theo yêu cầu
        System.out.println("Tập dữ liệu ban đầu:");
        System.out.println(dataSet);

        System.out.println("\nTập dữ liệu sắp xếp theo thứ tự tăng dần:");
        DataSet.printFractions(dataSet.sortIncreasing());

        System.out.println("\nTập dữ liệu sắp xếp theo thứ tự giảm dần:");
        DataSet.printFractions(dataSet.sortDecreasing());

        // 4. In ra các phân số tối giản của tập dữ liệu ban đầu và sắp xếp tăng/giảm dần
        System.out.println("\nCác phân số tối giản của tập dữ liệu ban đầu:");
        DataSet simplifiedDataSet = dataSet.toSimplify();
        System.out.println(simplifiedDataSet);

        System.out.println("\nCác phân số tối giản sắp xếp theo thứ tự tăng dần:");
        DataSet.printFractions(simplifiedDataSet.sortIncreasing());

        System.out.println("\nCác phân số tối giản sắp xếp theo thứ tự giảm dần:");
        DataSet.printFractions(simplifiedDataSet.sortDecreasing());
    }
}
