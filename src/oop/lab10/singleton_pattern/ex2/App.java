package oop.lab10.singleton_pattern.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                - Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào đối tượng được tạo ra từ
                lớp StudentManager để quản lý.
                - Đối tượng tạo ra từ lớp StudentManager là duy nhất trong chương trình, do dùng Singleton Pattern,
                và được tạo ra bằng cách gọi hàm StudentManager.getInstance().
                */
                Student s = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(s);
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

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        init();
        System.out.println("Original data: ");
        testOriginalData();
        System.out.println("test Sort Maths Grade Increasing:");
        testSortMathsGradeIncreasing();
        System.out.println("test Sort Maths Grade Decreasing");
        testSortMathsGradeDecreasing();
        System.out.println("test Sort Physics Grade Increasing:");
        testSortPhysicsGradeIncreasing();
        System.out.println("test Sort Physics Grade Decreasing: ");
        testSortPhysicsGradeDecreasing();
        System.out.println("test Sort Chemistry Grade Increasing :");
        testSortChemistryGradeIncreasing();
        System.out.println("test Sort Chemistry Grade Decreasing: ");
        testSortChemistryGradeDecreasing();
        System.out.println("test Sort Average Grade Increasing: ");
        testSortAverageGradeIncreasing();
        System.out.println("test Sort Average Grade Decreasing: ");
        testSortAverageGradeDecreasing();
        System.out.println(" 3 highest avarage grade students: ");
        testFilterStudentsHighestAverageGrade();
        System.out.println(" 3 lowest avarage grade students: ");
        testFilterStudentsLowestAverageGrade();


        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu và theo yêu cầu đã cho.
        - Viết code để test cho tất cả các hàm test.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "C:\\Users\\Admin\\Downloads\\OOPKHII2324_Midterm_De3\\data\\students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortMathsGradeIncreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortMathsGradeDecreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortPhysicsGradeIncreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortPhysicsGradeIncreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortPhysicsGradeDecreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortPhysicsGradeDecreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortChemistryGradeIncreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortChemistryGradeIncreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortChemistryGradeDecreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortChemistryGradeDecreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortAverageGradeIncreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortAverageGradeDecreasing());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsHighestAverageGrade(3));
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().filterStudentsLowestAverageGrade(3));
        System.out.print(studentIds);
        System.out.println();
    }
}
