package first.bai_3;

public class BasicStatistics implements Statistics {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistics() {
        this.dataSet = null;
    }

    public void setDataSet(DataSet dataSet) {
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
        double[] arr = dataSet.toArray();
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double[] arr = dataSet.toArray();
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public double mean() {
        double[] arr = dataSet.toArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return (double)(sum/arr.length);
    }

    @Override
    public double variance() {
        /* TODO */
        double[] arr = dataSet.toArray();
        double sum = 0;
        double mean = mean();
        for (int i = 0; i < arr.length; i++) {
            sum+=(arr[i]-mean)*(arr[i]-mean);
        }
        return (double)(sum/arr.length);
    }

    @Override
    public AbstractDataSet rank() {
        /* TODO */
        double[] arr = dataSet.toArray();
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
        AbstractDataSet rank = new ArrayDataSet();
        for (int i = 0; i < R.length; i++) {
            rank.append(R[i]);
        }
        return rank;
    }

    @Override
    public double median() {
        /* TODO */
        double[] arr = dataSet.toArray();
        if(arr.length %2 == 0){
            return (double) ((arr[arr.length/2]+arr[(arr.length/2)-1])/2);
        }
        return arr[arr.length/2];
    }
}

