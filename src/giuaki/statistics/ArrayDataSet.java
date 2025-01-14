package giuaki.statistics;

import java.util.Arrays;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        /* TODO */
        this.size = 0;
        data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    @Override
    public double elementAt(int index) {
        /* TODO */
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        return Arrays.copyOf(data, to - from);
    }

    /**
     * Thêm phần tử dữ liệu vào đầu mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(double value) {
        /* TODO */
        if(data.length == size){
            allocateMore();
        }
        for (int i = size; i > 0 ; i--) {
            data[i] = data[i-1];
        }
        data[0] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(double value) {
        /* TODO */
        if(data.length == size){
            allocateMore();
        }
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param index
     * @param value
     */
    @Override
    public void insertAtPosition(int index, double value) {
        /* TODO */
        if(size == data.length){
            allocateMore();
        }
        if(data.length == size){
            allocateMore();
        }
        for (int i = size; i > index ; i--) {
            data[i] = data[i-1];
        }
        data[0] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        for(int i = index; i < size; i++){
            data[i] = data[i+1];
        }
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(data[i] == value){
                arr[count] = i;
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == arr[j]){
                    remove(arr[j]);
                }
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void allocateMore() {
        /* TODO */
        double[] arr = new double[size*2];
        System.arraycopy(data, 0, arr, 0, data.length);
        data = arr;
    }
}
