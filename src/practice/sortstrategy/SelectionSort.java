package practice.sortstrategy;

public class SelectionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Selection sort.
     * @param data
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */

    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            double max = data[i];
            int Idx = i;
            for (int j = i; j < data.length; j++) {
                if(max < data[j]){
                    max = data[j];
                    Idx = j;
                }
            }
            double tmp = data[Idx];
            data[Idx] = data[i];
            data[i] = tmp;
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            double max = data[i];
            int Idx = i;
            for (int j = i; j < data.length; j++) {
                if(max > data[j]){
                    max = data[j];
                    Idx = j;
                }
            }
            double tmp = data[Idx];
            data[Idx] = data[i];
            data[i] = tmp;
        }
    }
}
