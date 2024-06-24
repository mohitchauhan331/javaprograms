package basicprograms;
import java.util.Scanner;
public class threevariableswap {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first number;");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second numbre;");
        int num2 = scanner.nextInt();

        int temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping:");
        System.out.println("First number:"+num1);
        System.out.println("Second number:"+num2);;
    }
}
