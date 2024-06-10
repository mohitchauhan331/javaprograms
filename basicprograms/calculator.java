package basicprograms;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display menu
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    double difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    double product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        double modulus = num1 % num2;
                        System.out.println("Result: " + modulus);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); 
        }
    }
}
