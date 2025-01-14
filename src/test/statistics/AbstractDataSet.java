package test.statistics;

import java.util.Arrays;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if(index < 0 || index > limit){
            return false;
        }
        return true;
    }

    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu theo định dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        return Arrays.toString(this.toArray());
    }
}
