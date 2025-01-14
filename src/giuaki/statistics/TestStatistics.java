package giuaki.statistics;

import java.util.Arrays;
import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /* TODO

         - Viết các hàm test như yêu cầu và chạy test chương trình.
         - Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
          - Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        System.out.println("testArrayDataSet: ");
        testArrayDataSet();
        System.out.println("------------------------------------");
        System.out.println("testListDataSet: ");
        testListDataSet();
    }

    public static void testArrayDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
         In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */
        Random random = new Random();
        int n = random.nextInt(11)+10;
        ArrayDataSet a = new ArrayDataSet();
        for (int i = 0; i < n; i++) {
            a.insertAtStart(random.nextDouble());
        }
        System.out.println(a);
        BasicStatistic b = new BasicStatistic();
        b.setDataSet(a);
        System.out.println("size :"+b.size());
        System.out.println("max: "+b.max());
        System.out.println("min: "+b.min());
        System.out.println("mean: "+b.mean());
        System.out.println("variance "+b.variance());
        System.out.println("rank: "+ Arrays.toString(b.rank()));
        System.out.println("median "+b.median());

        a.remove(0);
        a.remove(n-1);
        System.out.println(a);
        BasicStatistic b1 = new BasicStatistic();
        b1.setDataSet(a);
        System.out.println("size :"+b1.size());
        System.out.println("max: "+b1.max());
        System.out.println("min: "+b1.min());
        System.out.println("mean: "+b1.mean());
        System.out.println("variance "+b1.variance());
        System.out.println("rank: "+ Arrays.toString(b1.rank()));
        System.out.println("median "+b1.median());


    }

    public static void testListDataSet() {
        /* TODO
         - Sinh ra một số tự nhiên ngẫu nhiên trong đoạn [10, 20], gọi là n.
         - Sinh ra n số thực kiểu double ngẫu nhiên, cho vào tập dữ liệu
         - In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         - Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
         In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
         */
        Random random = new Random();
        int n = random.nextInt(11)+10;
        ListDataSet a = new ListDataSet();
        for (int i = 0; i < n; i++) {
            a.insertAtStart(random.nextDouble());
        }
        System.out.println(a);
        BasicStatistic b = new BasicStatistic();
        b.setDataSet(a);
        System.out.println("size :"+b.size());
        System.out.println("max: "+b.max());
        System.out.println("min: "+b.min());
        System.out.println("mean: "+b.mean());
        System.out.println("variance "+b.variance());
        System.out.println("rank: "+ Arrays.toString(b.rank()));
        System.out.println("median "+b.median());

        a.remove(0);
        a.remove(n-1);
         System.out.println(a);

        BasicStatistic b1 = new BasicStatistic();
        b1.setDataSet(a);
        System.out.println("size :"+b1.size());
        System.out.println("max: "+b1.max());
        System.out.println("min: "+b1.min());
        System.out.println("mean: "+b1.mean());
        System.out.println("variance "+b1.variance());
        System.out.println("rank: "+ Arrays.toString(b1.rank()));
        System.out.println("median "+b1.median());


    }
}
