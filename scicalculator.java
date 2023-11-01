import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCharacterOperatorCalculator {

    private static double num1, num2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator;

        System.out.println("Multi-Character Operator Calculator");
        System.out.println("Available operators: +, -, *, /, %, sqrt, pow, sin, cos, tan, log");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter operator or 'exit': ");
            operator = scanner.next();

            if (operator.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                getNumbers(operator, scanner);
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input");
                scanner.next(); // clear the invalid input from the buffer
                continue;
            }

            double result = calculateResult(operator, num1, num2);
            printResult(operator, num1, num2, result);
        }
    }

    private static void getNumbers(String operator, Scanner scanner) {
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        if (!operator.equals("sqrt")) {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }
    }

    private static double calculateResult(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(0);
                }
            case "%":
                return num1 * (num2 / 100);
            case "sqrt":
                return Math.sqrt(num1);
            case "pow":
                return Math.pow(num1, num2);
            case "sin":
                return Math.sin(Math.toRadians(num1));
            case "cos":
                return Math.cos(Math.toRadians(num1));
            case "tan":
                return Math.tan(Math.toRadians(num1));
            case "log":
                return Math.log10(num1);
            default:
                System.out.println("Error: Invalid operator");
                System.exit(0);
        }
        return 0; // This line should not be reached
    }

    private static void printResult(String operator, double num1, double num2, double result) {
        if (operator.equals("%")) {
            System.out.println("Result: " + num1 + " % " + (num2 * 100) + " = " + result + "%");
        } else if (operator.equals("sqrt")) {
            System.out.println("Result: sqrt(" + num1 + ") = " + result);
        } else if (operator.equals("pow")) {
            System.out.println("Result: " + num1 + " ^ " + num2 + " = " + Math.round(result));
        } else {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
