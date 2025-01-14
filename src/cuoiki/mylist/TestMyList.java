package cuoiki.mylist;

import java.util.Random;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList list = new MyArrayList();
        Random random = new Random();
        int size = random.nextInt(21)+10;
        for (int i = 0; i < size; i++) {
            list.append(random.nextDouble(30));
        }
        System.out.println(list.toString());
        BasicStatistic b = new BasicStatistic(list);
        System.out.println(b.max());
        System.out.println(b.min());
        System.out.println(b.mean());
        System.out.println(b.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
    }
}
