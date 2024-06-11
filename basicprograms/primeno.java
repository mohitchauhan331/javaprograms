package basicprograms;
import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num= scanner.nextInt();
        
        if (isprime(num)){
            System.out.println(num+"is a prime num");
        }else{
            System.out.println(num+"is not a prime num");
        }
    }
        public static boolean isprime (int n){
            if (n<=1)return false;
            if (n<=3)return false;
            if (n%2==0 ||n%3==0)return false;
            for (int i =5;i*i<=n;i+=6){
                if (n%1==0 || n%(i+1)==0)return false;

            }
        return true ;
        }
}
