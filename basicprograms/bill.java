package basicprograms;
import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);

     System.out.println("Enter the number of units consumed:");
     int units = scanner.nextInt();

     double billamount= calculatebill(units);
     System.out.println("the electricity bill is :"+billamount+"rupee");
    }
    static double calculatebill(int units){
        double amount ;

        if (units<=600){
        amount =0;
    }else {
        amount = units*8;
    }
    return amount;
}
}
