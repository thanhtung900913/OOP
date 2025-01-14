package cuoiki.statistics;

import java.util.Arrays;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size(); i++) {
            sb.append(this.elementAt(i));
            if(i != this.size()-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
