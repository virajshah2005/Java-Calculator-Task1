import java.util.Scanner;

public class Calculator {
    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalc = 0;

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0;
            try {
                switch (operation) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Continue? (y/n): ");
            continueCalc = scanner.next().charAt(0);
        } while (continueCalc == 'y' || continueCalc == 'Y');

        scanner.close();
        System.out.println("Calculator closed.");
    }
}