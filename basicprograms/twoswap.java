package basicprograms;
import java.util.Scanner;
public class twoswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swapping:");
        System.out.println("First number:"+num1);
        System.out.println("Second number:"+num2);
        
    }
    
}
