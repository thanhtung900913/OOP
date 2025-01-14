package test.statistics;

import cuoiki.mylist.BasicStatistic;

import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /* Yêu cầu:

        I. Hoàn thiện các file source code đã cho. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [20 - 30]. Tạo ra tập dữ liệu kiểu ArrayDataSet gồm các phần tử
               là các số double được sinh ngẫu nhiên, và có số phần tử bằng số tự nhiên đã cho.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu. In ra các dữ liệu thống kê về tập dữ liệu
               (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho LinkedListDataSet:
            1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [20 - 30]. Tạo ra tập dữ liệu kiểu ArrayDataSet gồm các phần tử
               là các số double được sinh ngẫu nhiên, và có số phần tử bằng số tự nhiên đã cho.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu. In ra các dữ liệu thống kê về tập dữ liệu
               (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <TenSinhVien_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <TenSinhVien_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        testStatisticsUsingArrayDataSet();
        testStatisticsUsingLinkedListDataSet();
    }

    /**
     * Hàm test cho tập dữ liệu kiểu ArrayDataSet.
     */
    public static void testStatisticsUsingArrayDataSet() {
        /* TODO */
        Random random = new Random();
        int size = random.nextInt(11)+20;
        AbstractDataSet data = new ArrayDataSet();
        for (int i = 0; i < size; i++) {
            data.append(random.nextDouble());
        }
        System.out.println(data);
        BasicStatistics statistics = new BasicStatistics();
        statistics.setDataSet(data);
        System.out.println("size: "+statistics.size());
        System.out.println("max: "+statistics.max());
        System.out.println("min: "+statistics.min());
        System.out.println("mean: "+statistics.mean());
        System.out.println("variance: "+statistics.variance());


    }

    /**
     * Hàm test cho tập dữ liệu kiểu LinkedListDataSet.
     */
    public static void testStatisticsUsingLinkedListDataSet() {
        /* TODO */
        Random random = new Random();
        int size = random.nextInt(11)+20;
        AbstractDataSet data = new LinkedListDataSet();
        for (int i = 0; i < size; i++) {
            data.append(random.nextDouble());
        }
        System.out.println(data);
        BasicStatistics statistics = new BasicStatistics();
        statistics.setDataSet(data);
        System.out.println("size: "+statistics.size());
        System.out.println("max: "+statistics.max());
        System.out.println("min: "+statistics.min());
        System.out.println("mean: "+statistics.mean());
        System.out.println("variance: "+statistics.variance());
    }
}
