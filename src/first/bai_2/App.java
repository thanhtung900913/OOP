package first.bai_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
//        testSortStudentByName();
//        testSortStudentByGradeIncreasing();
//        testSortStudentByGradeDecreasing();
//        testFilterStudentsHighestGrade();
//        testFilterStudentsLowestGrade();
    }

    public static void init() {
        String filePath = "C:\\Users\\Admin\\Documents\\Zalo Received Files\\OOP_Midterm_DS_HK12324\\data\\students.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7 || dataList.get(0).equals("id")) {
                    continue;
                }

                // Create Student object using Builder Pattern
                Student newStudent = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withMathsGrade(Double.parseDouble(dataList.get(3)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(4)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(5)))
                        .build();

                // Add Student to StudentManager
                studentManager.append(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void testOriginalData() {
        List<Student> studentList = studentManager.getStudentList();
        StudentManager.print(studentList);
    }

    public static void testSortStudentByName() {
        List<Student> sortedByName = new ArrayList<>(studentManager.getStudentList());
        sortedByName.sort(Comparator.comparing(Student::getLastname).thenComparing(Student::getFirstname));
        StudentManager.print(sortedByName);
    }

    public static void testSortStudentByGradeIncreasing() {
        List<Student> sortedByGradeIncreasing = new ArrayList<>(studentManager.getStudentList());
        sortedByGradeIncreasing.sort(Comparator.comparing(Student::getAverageGrade)
                .thenComparing(Student::getMathsGrade));
        StudentManager.print(sortedByGradeIncreasing);
    }

    public static void testSortStudentByGradeDecreasing() {
        List<Student> sortedByGradeDecreasing = new ArrayList<>(studentManager.getStudentList());
        sortedByGradeDecreasing.sort(Comparator.comparing(Student::getAverageGrade)
                .reversed().thenComparing(Student::getMathsGrade).reversed());
        StudentManager.print(sortedByGradeDecreasing);
    }

    public static void testFilterStudentsHighestGrade() {
        List<Student> filtered = studentManager.filterStudentsHighestGrade(5); // Example: top 5 students
        StudentManager.print(filtered);
    }

    public static void testFilterStudentsLowestGrade() {
        List<Student> filtered = studentManager.filterStudentsLowestGrade(5); // Example: bottom 5 students
        StudentManager.print(filtered);
    }
}
