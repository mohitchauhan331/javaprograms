package basicprograms;

import java.util.Scanner;
public class Markscalculator {
    public static void main (String argu []){
        Scanner scanner = new Scanner (System.in);
    
    System.out.print("Enter the marks for subject 1 :");
    int subject1 = scanner.nextInt();

    System.out.print("Enter the marks for subject 2 :");
    int subject2 = scanner.nextInt();

    System.out.print("Enter the marks for subject 3 :");
    int subject3 = scanner.nextInt();

    int totalMarks =subject1 + subject2 + subject3;

    int maxMarks = 100;
    int maxtotalMarks = maxMarks*3;

    double percentage = (double) totalMarks / maxtotalMarks * 100;

    int greatest  = (subject1 > subject2) ? 
                    ((subject1 > subject3) ? subject1 : subject3) : 
                    ((subject2 > subject3) ? subject2 : subject3);

                    System.out.println("Total Marks: " + totalMarks);
                    System.out.println("Percentage: " + percentage + "%");
                    System.out.println("Greatest Mark: " + greatest);

   }
}
