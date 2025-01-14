package giuaki.statistics;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
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
        double max = dataSet.elementAt(0);
        for (int i = 0; i < size(); i++) {
            if(max < dataSet.elementAt(i)){
                max = dataSet.elementAt(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double min = dataSet.elementAt(0);
        for (int i = 0; i < size(); i++) {
            if(min > dataSet.elementAt(i)){
                min = dataSet.elementAt(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        double sum = 0;

        for (int i = 0; i < size(); i++) {
            sum+= dataSet.elementAt(i);
        }
        return (double)(sum/size());
    }

    @Override
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum+=(mean-dataSet.elementAt(i))*(mean-dataSet.elementAt(i));
        }
        return (double)(sum/size());
    }

    @Override
    public double[] rank() {
        /* TODO */
        double[] arr = dataSet.elements(0, size());
        double[] R = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int s = 1, r = 1;
            for (int j = 0; j < arr.length; j++) {
                if(j != i && arr[j] < arr[i]){
                    s++;
                }
                if(j != i && arr[j] == arr[i]){
                    r++;
                }
            }
            R[i] = (double) (s + (r-1)/2);
        }
        return R;
    }

    @Override
    public double median() {
        /* TODO */
        double[] arr = dataSet.elements(0, size());
        if(arr.length %2 == 0){
            return (double) ((arr[arr.length/2]+arr[(arr.length/2)-1])/2);
        }
        return arr[arr.length/2];
    }
}
