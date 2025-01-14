package lab5.ex1_5;

public class TestMain {
    public static void main(String[] args) {
        // Create a MyDate object
        MyDate date = new MyDate(2024, 3, 10);

        // Print the initial date
        System.out.println("Initial date: " + date.toString());

        // Test nextDay()
        date.nextDay();
        System.out.println("Date after nextDay(): " + date.toString());

        // Test nextMonth()
        date.nextMonth();
        System.out.println("Date after nextMonth(): " + date.toString());

        // Test nextYear()
        date.nextYear();
        System.out.println("Date after nextYear(): " + date.toString());

        // Test previousDay()
        date.previousDay();
        System.out.println("Date after previousDay(): " + date.toString());

        // Test previousMonth()
        date.previousMonth();
        System.out.println("Date after previousMonth(): " + date.toString());

        // Test previousYear()
        date.previousYear();
        System.out.println("Date after previousYear(): " + date.toString());
    }
}
