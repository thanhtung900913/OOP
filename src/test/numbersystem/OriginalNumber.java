package test.numbersystem;

import java.util.List;
public class OriginalNumber {
    private String number;
    private int base;

    public OriginalNumber(String number, int base) {
        this.number = number;
        this.base = base;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
