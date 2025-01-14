package lab5.ex1_4;

public class TestMain {
    public static void main(String[] args) {
        // Create a MyTime object
        MyTime time = new MyTime(12, 30, 45);

        // Print the initial time
        System.out.println("Initial time: " + time.toString());

        // Test nextSecond()
        time.nextSecond();
        System.out.println("Time after nextSecond(): " + time.toString());

        // Test nextMinute()
        time.nextMinute();
        System.out.println("Time after nextMinute(): " + time.toString());

        // Test nextHour()
        time.nextHour();
        System.out.println("Time after nextHour(): " + time.toString());

        // Test previousSecond()
        time.previousSecond();
        System.out.println("Time after previousSecond(): " + time.toString());

        // Test previousMinute()
        time.previousMinute();
        System.out.println("Time after previousMinute(): " + time.toString());

        // Test previousHour()
        time.previousHour();
        System.out.println("Time after previousHour(): " + time.toString());
    }
}
