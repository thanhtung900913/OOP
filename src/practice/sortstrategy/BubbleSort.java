package practice.sortstrategy;

public class BubbleSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Bubble sort.
     * @param data
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if(order == true){
            sortAscending(data);
        }else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if(data[j] < data[j-1]){
                    double tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if(data[j] > data[j-1]){
                    double tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
        }
    }
}
