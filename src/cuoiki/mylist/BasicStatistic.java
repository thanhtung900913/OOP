package cuoiki.mylist;

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
        double max = (double) data.get(0);
        for (int i = 0; i < data.size(); i++) {
            double current_value = (double) data.get(i);
            if(max < current_value){
                max = current_value;
            }

        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = (double) data.get(0);
        for (int i = 0; i < data.size(); i++) {
            double current_value = (double) data.get(i);
            if(min > current_value){
                min = current_value;
            }

        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return (double) (sum/data.size());
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum+=(mean- (double) data.get(i))*(mean- (double) data.get(i));
        }
        return (double) sum/data.size();
    }
}
