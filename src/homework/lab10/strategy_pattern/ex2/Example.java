package homework.lab10.strategy_pattern.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.print("Enter first number: ");
        int firstNumber = readNumber();

        System.out.print("Enter second number: ");
        int secondNumber = readNumber();

        System.out.print("Choose operation (1 - addition, 2 - subtraction, 3 - multiplication): ");
        int choice = readNumber();

        if (choice == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (choice == 2) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (choice == 3) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else {
            System.out.println("Invalid choice");
            return;
        }

        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);
    }

    private static int readNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
