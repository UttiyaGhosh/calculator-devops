package calculator;
import ch.qos.logback.core.rolling.RollingFileAppender;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.println("Press 1 to Add\nPress 2 to Subtract\nPress 3 to Multiply\nPress 4 to Divide\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Addition result is : "+calculator.add(number1, number2));
                    break;
                case 2:
                    // do subtraction
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    break;
                case 3:
                    // do multiplication
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    break;
                case 4:
                    // do division
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        }while (true);
    }


    public double add(double number1, double number2) {
        logger.info("Adding two numbers "+number1+" and "+number2);
        double result = number1 + number2;
        logger.info("Result of addition is "+result);
        return result;
    }

}
