import java.util.Scanner;

public class MultiCharacterOperatorCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store numbers, operator, and result
        double num1 = 0, num2 = 0, result = 0;
        String operator;

        // Display program information
        System.out.println("Multi-Character Operator Calculator");
        System.out.println("Available operators: +, -, *, /, %, sqrt, pow, sin, cos, tan, log");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            // Prompt the user to enter an operator or 'exit'
            System.out.print("Enter operator or 'exit': ");
            operator = scanner.next();

            // Check if the user wants to exit the program
            if (operator.equals("exit")) {
                System.out.println("Goodbye!");
                break; // Exit the loop if 'exit' is entered
            }

            try {
                // Handle different operations based on the operator
                switch (operator) {
                    case "+":
                    case "-":
                    case "*":
                    case "/": // Missing case for division

                        // Prompt the user to enter the first number
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();

                        // Prompt the user to enter the second number
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        break;

                    case "%":
                        // Prompt the user to enter a number and a percentage (0-100)
                        System.out.print("Enter number and percentage (0-100): ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        num2 /= 100; // Convert percentage to a decimal value
                        break;

                    case "sqrt":
                        // Prompt the user to enter a number for square root
                        System.out.print("Enter number for square root: ");
                        num1 = scanner.nextDouble();
                        num2 = Math.sqrt(num1);
                        break;

                    case "pow":
                        // Prompt the user to enter a base and exponent for the power operation
                        System.out.print("Enter base and exponent for power operation: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        num1 = Math.pow(num1, num2);
                        break;

                    case "sin":
                        // Prompt the user to enter an angle for sine (in degrees)
                        System.out.print("Enter an angle for sin (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.sin(Math.toRadians(num1)); // Convert degrees to radians
                        break;

                    case "cos":
                        // Prompt the user to enter an angle for cosine (in degrees)
                        System.out.print("Enter an angle for cos (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.cos(Math.toRadians(num1)); // Convert degrees to radians
                        break;

                    case "tan":
                        // Prompt the user to enter an angle for tangent (in degrees)
                        System.out.print("Enter an angle for tan (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.tan(Math.toRadians(num1)); // Convert degrees to radians
                        break;

                    case "log":
                        // Prompt the user to enter a number for logarithm (base 10)
                        System.out.print("Enter a number for logarithm (base 10): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.log10(num1);
                        break;

                    default:
                        System.out.println("Error: Invalid operator");
                        continue; // Continue to the next iteration of the loop
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input");
                continue; // Continue to the next iteration of the loop if an exception is caught
            }

            // Calculate the result based on the selected operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue; // Continue to the next iteration of the loop
                    }
                    break;

                case "%":
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " % " + (num2 * 100) + " = " + result + "%");
                    continue; // Continue to the next iteration of the loop

                case "sqrt":
                    System.out.println("Result: sqrt(" + num1 + ") = " + num2);
                    continue; // Continue to the next iteration of the loop

                case "pow":
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + Math.round(result)); // Fix output
                    continue; // Continue to the next iteration of the loop

                case "sin":
                    System.out.println("Result: sin(" + num1 + " degrees) = " + num2);
                    continue; // Continue to the next iteration of the loop

                case "cos":
                    System.out.println("Result: cos(" + num1 + " degrees) = " + num2);
                    continue; // Continue to the next iteration of the loop

                case "tan":
                    System.out.println("Result: tan(" + num1 + " degrees) = " + num2);
                    continue; // Continue to the next iteration of the loop

                case "log":
                    System.out.println("Result: log(" + num1 + ") = " + num2);
                    continue; // Continue to the next iteration of the loop
            }

            // Display the final result
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
