package basicprograms;
import java.util.Scanner;
public class print
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
        int n = 5; 

        for (int i = 0; i < n; i++) {
            
            System.out.print("*");

            for (int j = 0; j < n; j++) {
                if (i == j && i <= n / 2) {

                    System.out.print("*");
                } else if (i + j == n - 1 && i <= n / 2) {
                    
                    System.out.print("*");
                } else {
                    
                    System.out.print(" ");
                }
            }

            System.out.print("*");

            System.out.println();
        }
    }
}
