package cuoiki.fraction;

import java.util.Arrays;
import java.util.Comparator;

public class DataSet {
    private static int DEFAULT_CAPACITY = 8;
    private Fraction[] data;
    private int length;

    public DataSet() {
        data = new Fraction[DEFAULT_CAPACITY];
        length = 0;
    }

    public DataSet(Fraction[] data) {
        this.data = data;
        length = data.length;
    }

    public boolean insert(Fraction fraction, int index) {
        if (!checkBoundaries(index, length))
            return false;

        if (length == data.length)
            enlarge();

        for (int i = length; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = fraction;
        length++;
        return true;
    }

    public DataSet toSimplify() {
        DataSet newDataSet = new DataSet();
        for (int i = 0; i < length; i++) {
            Fraction simplifiedFraction = data[i];
            simplifiedFraction.simplify();// Gọi simplify() để tạo phân số mới đã tối giản
            newDataSet.append(simplifiedFraction);
        }
        return newDataSet;
    }

    public void append(Fraction fraction) {
        if (length == data.length)
            enlarge();

        data[length++] = fraction;
    }

    public Fraction[] sortIncreasing() {
        Fraction[] tmp = Arrays.copyOf(data, length);
        Arrays.sort(tmp, Comparator.comparing(Fraction::doubleValue));
        return tmp;
    }

    public Fraction[] sortDecreasing() {
        Fraction[] tmp = Arrays.copyOf(data, length);
        Arrays.sort(tmp, (f1, f2) -> Double.compare(f2.doubleValue(), f1.doubleValue()));
        return tmp;
    }

    private void enlarge() {
        Fraction[] newArr = new Fraction[data.length * 2];
        System.arraycopy(data, 0, newArr, 0, length);
        data = newArr;
    }

    private boolean checkBoundaries(int index, int upperBound) {
        return index >= 0 && index <= upperBound;
    }

    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < data.length-1; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append(data[data.length-1]).append("]");
        return sb.toString();
    }


    public static void printFractions(Fraction[] fractions) {
        System.out.print("[");
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i < fractions.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
