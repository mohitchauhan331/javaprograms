package basicprograms;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print it's mutiplication table:");
        int number = scanner.nextInt();

        printmultiplication(number);

    }
    
    public static void printmultiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
