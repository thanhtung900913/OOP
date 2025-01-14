package oop.lab12.mylist;


public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        System.out.println("================================================================");
        testMyLikedList();
    }

    public static void testMyArrayList() {
        int length = (int) (Math.random() * (50 - 30 + 1) + 30); // Sinh ngẫu nhiên độ dài của danh sách
        MyList list = new MyArrayList(); // Tạo danh sách mới

        // Thêm các phần tử vào danh sách với giá trị ngẫu nhiên trong đoạn [1, 20]
        for (int i = 0; i < length; i++) {
            double value = Math.random() * 20 + 1;
            list.append(value);
        }

        // Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản
        BasicStatistic basicStatistic = new BasicStatistic(list);

        double max = basicStatistic.max();
        double min = basicStatistic.min();
        double mean = basicStatistic.mean();
        double variance = basicStatistic.variance();

        // In ra các thông tin về dữ liệu và các đại lượng thống kê
        System.out.println("Data: " + list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);

    }
    public static void testMyLikedList() {
        int length = (int) (Math.random() * (50 - 30 + 1) + 30); // Sinh ngẫu nhiên độ dài của danh sách
        MyLinkedList list = new MyLinkedList(); // Tạo danh sách mới

        // Thêm các phần tử vào danh sách với giá trị ngẫu nhiên trong đoạn [1, 20]
        for (int i = 0; i < length; i++) {
            double value = Math.random() * 20 + 1;
            list.append(value);
        }

        // Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản
        BasicStatistic basicStatistic = new BasicStatistic(list);

        double max = basicStatistic.max();
        double min = basicStatistic.min();
        double mean = basicStatistic.mean();
        double variance = basicStatistic.variance();

        // In ra các thông tin về dữ liệu và các đại lượng thống kê
        System.out.println("Data: " + list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);

    }
}
