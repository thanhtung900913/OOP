package cuoiki.basicstatistics;

public class BasicStatisticsTestDrive {
    public static void main(String[] args) {
        testMyArrayList();
        // testMyLinkedList();
    }

    public static void testMyArrayList() {
        int length = (int) (Math.random() * (50 - 30 + 1) + 30); // Sinh ngẫu nhiên độ dài của danh sách
        MyArrayList list = new MyArrayList(); // Tạo danh sách mới

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
