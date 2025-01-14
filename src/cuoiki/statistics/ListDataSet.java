package cuoiki.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet() {
        /* TODO */
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return this.data.size();
    }

    @Override
    public double elementAt(int index) {
        /* TODO */
        return this.data.get(index);
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        double[] arr = new double[to - from+1];
        for (int i = from; i <= to; i++) {
            arr[i] = data.get(i);
        }
        return arr;
    }

    @Override
    public void insertAtStart(double data) {
        this.data.add(0, data);
    }

    @Override
    public void insertAtEnd(double data) {
        this.data.add(data);
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param index
     * @param value
     */
    @Override
    public void insertAtPosition(int index, double value) {
        /* TODO */
        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            if(data.get(i)== value){
                data.remove(i);
            }
        }
    }
}
