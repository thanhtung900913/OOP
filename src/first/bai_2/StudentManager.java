package first.bai_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        this.studentList = new LinkedList<>();
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if(index < 0 || index > limit){
            return false;
        }
        return true;
    }

    public List<Student> getStudentList() {
        /* TODO */
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        this.studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index, chỉ thêm vào nếu index có giá trị
     * nằm trong đoạn từ [0 - length], trong đó length là số sinh viên trong danh sách hiện tại.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        if(!checkBoundaries(index,studentList.size())){
            throw  new ArrayIndexOutOfBoundsException();
        }
        this.studentList.add(index, student);
    }

    /**
     * Xóa sinh viên ở vị trí index, chỉ xóa được nếu index nằm trong đoạn [0 - (length - 1)],
     * trong đó length là số sinh viên trong danh sách hiện tại.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index.
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return this.studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên và sau đó đến họ.
     * @return
     */
    public List<Student> sortStudentByName() {
        /* TODO */
        Collections.sort(studentList,Student::compareTo);
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tiêu chí, đầu tiên so sánh điểm trung bình,
     * nếu điểm trung bình bằng nhau thì so sánh điểm toán.
     * Sử dụng giao diện MyStudentComparator để thực hiện tiêu chí sắp xếp.
     *
     * @return
     */
    public List<Student> sortByGradeIncreasing() {
        Collections.sort(studentList, (s1, s2) -> {
            if (s1.getAverageGrade() == s2.getAverageGrade()) {
                return Double.compare(s1.getMathsGrade(), s2.getMathsGrade());
            }
            return Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
        });
        return studentList;
    }

    public List<Student> sortByGradeDecreasing() {
        Collections.sort(studentList, (s1, s2) -> {
            if (s1.getAverageGrade() == s2.getAverageGrade()) {
                return Double.compare(s2.getMathsGrade(), s1.getMathsGrade());
            }
            return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
        });
        return studentList;
    }

    public List<Student> filterStudentsHighestGrade(int howMany) {
        sortByGradeDecreasing();
        return studentList.subList(0, Math.min(howMany, studentList.size()));
    }

    public List<Student> filterStudentsLowestGrade(int howMany) {
        sortByGradeIncreasing();
        return studentList.subList(0, Math.min(howMany, studentList.size()));
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student student : studentList) {
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
