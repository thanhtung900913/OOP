package first.bai_1;

import java.util.Arrays;
import java.util.Random;

public class TestSortStrategy {
    public static void main(String[] args) {
        // Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        Random random = new Random();
        int size = random.nextInt(11) + 20; // Số tự nhiên trong khoảng [20 - 30]

        // Sinh ra ngẫu nhiên một mảng các số kiểu double
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextDouble() * 100; // Số kiểu double ngẫu nhiên trong khoảng [0.0 - 100.0)
        }

        // Copy dữ liệu mảng trên sang 2 mảng khác để có 3 mảng có dữ liệu giống nhau.
        double[] data1 = Arrays.copyOf(data, size);
        double[] data2 = Arrays.copyOf(data, size);

        // Tạo đối tượng có kiểu dữ liệu SortStrategy.
        SortStrategy sortStrategy = SortStrategy.getInstance();

        // Test 3 thuật toán đã cho với 3 mảng dữ liệu trên.
        System.out.println("Using Bubble Sort Algorithm:");
        sortStrategy.setSortee(new BubbleSort());
        System.out.println("Before sorting: " + Arrays.toString(data));
        sortStrategy.sort(data);
        System.out.println("After sorting: " + Arrays.toString(data));

        System.out.println();

        System.out.println("Using Insertion Sort Algorithm:");
        sortStrategy.setSortee(new InsertionSort());
        System.out.println("Before sorting: " + Arrays.toString(data1));
        sortStrategy.sort(data1);
        System.out.println("After sorting: " + Arrays.toString(data1));

        System.out.println();

        System.out.println("Using Selection Sort Algorithm:");
        sortStrategy.setSortee(new SelectionSort());
        System.out.println("Before sorting: " + Arrays.toString(data2));
        sortStrategy.sort(data2);
        System.out.println("After sorting: " + Arrays.toString(data2));
    }
}
