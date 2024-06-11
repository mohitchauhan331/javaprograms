package basicprograms;
import java.util.Scanner;
public class fibo{
    public static int fibo(int n){
        if (n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
        public static void main (String argu[]){
            Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for fibonacci series:");
        int n = scanner.nextInt() ;

        System.out.println("fibonacci series upto"+n+"terms:");
        for (int i=0;i<n;i++){
            System.out.println(fibo(i)+"");
        }
    }
}