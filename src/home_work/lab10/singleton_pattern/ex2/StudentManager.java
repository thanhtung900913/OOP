package home_work.lab10.singleton_pattern.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        /* TODO */
        this.studentList = new ArrayList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if(instance == null){
            instance = new StudentManager();
        }
        return instance;
    }

    public List<Student> getStudentList() {
        /* TODO */
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.add(index, student);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên,
     * nếu tên như nhau thì sắp xếp theo họ.
     * Sử dụng giao diện StudentComparable để sắp xếp.
     * @return
     */
    public List<Student> sortStudentByName() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int com = o1.getFirstname().compareTo(o2.getFirstname());
                if(com != 0){
                    return com;
                }
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getMathsGrade(), o2.getMathsGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getMathsGrade(), o1.getMathsGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getPhysicsGrade(), o2.getPhysicsGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getPhysicsGrade(), o1.getPhysicsGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getChemistryGrade(), o2.getChemistryGrade());
            }
        });
        return studentList;

    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getChemistryGrade(), o1.getChemistryGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverageGrade(), o2.getAverageGrade());
            }
        });
        return studentList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
            }
        });
        return studentList;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        List<Student> s1 = new ArrayList<>();
        List<Student> s2 = sortAverageGradeDecreasing();
        for (int i = 0; i < howMany; i++) {
            s1.add(i, s2.get(i));
        }
        return s1;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        List<Student> s1 = new ArrayList<>();
        List<Student> s2 = sortAverageGradeIncreasing();
        for (int i = 0; i < howMany; i++) {
            s1.add(i, s2.get(i));
        }
        return s1;
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
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
