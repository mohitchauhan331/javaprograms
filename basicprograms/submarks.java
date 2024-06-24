package basicprograms;
import java.util.Scanner;
public class submarks {
    public static void main (String argu []){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter marks for subject1:");
     int subject1 = scanner.nextInt();

     System.out.println("Enter marks for subject2:");
     int subject2 = scanner.nextInt();

     System.out.println("Enter marks for subject3:");
     int subject3 = scanner.nextInt();

     int total= subject1+subject2+subject3;
     float average =  total/3;
     float percentage =(total/3);

     System.out.println("Total marks:"+total);
     System.out.println("average marks:"+average);
     System.out.println("percentage:"+percentage);
    }
}
