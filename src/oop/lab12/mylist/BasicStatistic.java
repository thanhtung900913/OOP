package oop.lab12.mylist;


public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        Object max = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            Comparable<Object> current = (Comparable<Object>) data.get(i);
            if (current.compareTo(max) > 0) {
                max = data.get(i);
            }
        }
        return (double) max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        Object min = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            Comparable<Object> current = (Comparable<Object>) data.get(i);
            if (current.compareTo(min) < 0) {
                min = current;
            }
        }
        return (double) min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        if (data.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

        double mean = mean();
        double sumSquaredDifference = 0;
        for (int i = 0; i < data.size(); i++) {
            double diff = ((double) data.get(i)) - mean;
            sumSquaredDifference += diff * diff;
        }
        return sumSquaredDifference / data.size();

    }
}
