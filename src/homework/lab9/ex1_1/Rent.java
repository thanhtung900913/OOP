package homework.lab9.ex1_1;
import java.util.Date;
public class Rent {
    Item itemm;
    Date end;
    Student student;
    Date begin;

    public Rent(Item itemm, Student student, Date end, Date begin) {
        this.itemm = itemm;
        this.end = end;
        this.student = student;
        this.begin = begin;
    }

    public Item getItemm() {
        return itemm;
    }

    public Date getEnd() {
        return end;
    }

    public Student getStudent() {
        return student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setItemm(Item itemm) {
        this.itemm = itemm;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "itemm=" + itemm +
                ", end=" + end +
                ", student=" + student +
                ", begin=" + begin +
                '}';
    }
}
