package practice.statistics;

public class BasicStatistics implements Statistics {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistics() {
        /* TODO */
        this.dataSet = null;
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        double max = dataSet.get(0);
        for (int i = 1; i < size(); i++) {
            if(max < dataSet.get(i)){
                max = dataSet.get(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double min = dataSet.get(0);
        for (int i = 1; i < size(); i++) {
            if(min > dataSet.get(i)){
                min = dataSet.get(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        double sum = 0.0;
        for (int i = 0; i < size(); i++) {
            sum+= dataSet.get(i);
        }
        return (double) (sum/ size());
    }

    @Override
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0.0;
        for (int i = 0; i <size() ; i++) {
            sum+= (mean - dataSet.get(i))*(mean - dataSet.get(i));
        }
        return (double) (sum/size());
    }

    @Override
    public AbstractDataSet rank() {
        /* TODO */
        return new ArrayDataSet();
    }

    @Override
    public double median() {
        /* TODO */
        return 0.0;
    }
}
