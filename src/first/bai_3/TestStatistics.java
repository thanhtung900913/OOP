package first.bai_3;


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
        System.out.println();
        System.out.println();
        testStatisticsUsingLinkedListDataSet();
    }

    /**
     * Hàm test cho tập dữ liệu kiểu ArrayDataSet.
     */
    public static void testStatisticsUsingArrayDataSet() {
        /* TODO */
        int size = (int) (Math.random() * 10) + 21;
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = Math.random() * 10;
        }
        ArrayDataSet dataSet = new ArrayDataSet();
        for (int i = 0; i < data.length; i++) {
            dataSet.append(data[i]);
        }
        BasicStatistics st = new BasicStatistics();
        st.setDataSet(dataSet);
        System.out.println("ArrayDataSet");
        System.out.println(dataSet);
        System.out.println("Size: " + dataSet.size());
        System.out.println("Max: " + st.max());
        System.out.println("Min: " + st.min());
        System.out.println("Mean: " + st.mean());
        System.out.println("Median: " + st.median());
        System.out.println("Variance: " + st.variance());
        System.out.println("Rank: " + st.rank());

        dataSet.remove(0);
        dataSet.remove(dataSet.size() - 1);
        System.out.println("\nArrayDataSet after remove first and last:");
        System.out.println(dataSet);
        System.out.println("Size: " + dataSet.size());
        System.out.println("Max: " + st.max());
        System.out.println("Min: " + st.min());
        System.out.println("Mean: " + st.mean());
        System.out.println("Median: " + st.median());
        System.out.println("Variance: " + st.variance());
        System.out.println("Rank: " + st.rank());

    }

    /**
     * Hàm test cho tập dữ liệu kiểu LinkedListDataSet.
     */
    public static void testStatisticsUsingLinkedListDataSet() {
        /* TODO */

        int size = (int) (Math.random() * 10) + 21;
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = Math.random() * 10;
        }
        LinkedListDataSet dataSet = new LinkedListDataSet();
        for (int i = 0; i < data.length; i++) {
            dataSet.append(data[i]);
        }
        BasicStatistics st = new BasicStatistics();
        st.setDataSet(dataSet);
        System.out.println("LinkedListDataSet: ");
        System.out.println(dataSet);
        System.out.println("Size: " + dataSet.size());
        System.out.println("Max: " + st.max());
        System.out.println("Min: " + st.min());
        System.out.println("Mean: " + st.mean());
        System.out.println("Median: " + st.median());
        System.out.println("Variance: " + st.variance());
        System.out.println("Rank: " + st.rank());

        dataSet.remove(0);
        dataSet.remove(dataSet.size() - 1);
        System.out.println("\nLinkedListDataSet after remove first and last:");
        System.out.println(dataSet);
        System.out.println("Size: " + dataSet.size());
        System.out.println("Max: " + st.max());
        System.out.println("Min: " + st.min());
        System.out.println("Mean: " + st.mean());
        System.out.println("Median: " + st.median());
        System.out.println("Variance: " + st.variance());
        System.out.println("Rank: " + st.rank());
    }
}

