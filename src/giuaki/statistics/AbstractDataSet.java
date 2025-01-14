package giuaki.statistics;

import java.util.Arrays;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        return Arrays.toString(this.elements(0, size()));
    }
}
