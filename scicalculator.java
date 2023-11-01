import java.util.Scanner;

public class MultiCharacterOperatorCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0, result = 0;
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
                
                switch (operator) {
                    case "+":
                    case "-":
                    case "*":
                    //we forgot to add case "/":
                        
                        
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        break;
                        
                    case "%":
                        System.out.print("Enter number and percentage (0-100): ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        num2 /= 100;
                        break;
                        
                    case "sqr":
                        System.out.print("Enter number for square root: ");
                        num1 = scanner.nextDouble();
                        num2 = Math.sqrt(num1);
                        break;
                        
                    case "pow":
                        System.out.print("Enter base and exponent for power operation: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        num1 = Math.pow(num1, num2);
                        break;
                        
                    case "sin":
                        System.out.print("Enter an angle for sin (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.sin(Math.toRadians(num1));
                        break;
                        
                    case "cos":
                        System.out.print("Enter an angle for cos (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.cos(Math.toRadians(num1));
                        break;
                        
                    case "tan":
                        System.out.print("Enter an angle for tan (in degrees): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.tan(Math.toRadians(num1));
                        break;
                        
                    case "log":
                        System.out.print("Enter a number for logarithm (base 10): ");
                        num1 = scanner.nextDouble();
                        num2 = Math.log10(num1);
                        break;
                        
                    default:
                        System.out.println("Error: Invalid operator");
                        continue;
                }
            } catch (Exception e)
            {
                System.out.println("Error: Invalid input");
                continue;
            }

            switch (operator)
            {
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
                        continue;
                    }
                    break;
                    
                case "%":
                    
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " % " + (num2 * 100) + " = " + result + "%");
                    continue;
                    
                case "sqrt":
                    
                    System.out.println("Result: sqrt(" + num1 + ") = " + num2);
                    continue;
                    
                case "pow":
                    
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + Math.round(num1));
                    continue;
                    
                    case "sin":
                        
                    System.out.println("Result: sin(" + num1 + " degrees) = " + num2);
                    continue;
                    
                case "cos":
                    
                    System.out.println("Result: cos(" + num1 + " degrees) = " + num2);
                    continue;
                    
                case "tan":
                    
                    System.out.println("Result: tan(" + num1 + " degrees) = " + num2);
                    continue;
                    
                case "log":
                    
                    System.out.println("Result: log(" + num1 + ") = " + num2);
                    continue;
            }

            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
