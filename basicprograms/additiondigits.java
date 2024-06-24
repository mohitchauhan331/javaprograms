package basicprograms;
import java.util.Scanner;
public class additiondigits {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number = ");
       int a = scanner.nextInt();

       int lastDigit = a%10;
       a = a/10;
       int secondLastDigit = a%10;

       int sum = lastDigit + secondLastDigit;
       System.out.println("Sum of last two digits of a number = " + sum);
       scanner.close();

    }
}
