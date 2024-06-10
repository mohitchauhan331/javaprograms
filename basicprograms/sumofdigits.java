package basicprograms;
import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = scanner.nextInt();
        int sum = 0 , lastdigit;
        while(a>0){
            lastdigit=a%10;
            a/=10;
            sum=lastdigit+sum;
           
        }
        System.out.println(sum);
        scanner.close();
    }
}

