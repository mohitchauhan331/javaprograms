package basicprograms;
import java.util.Scanner;
public class Studentmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int avg=0;int total=0;int highestmarks=0;

        System.out.println("ENTER THE NUMBER OF STUDENTS:");
        int n =scanner.nextInt();
        int marks[]=new int [n];  
 
  
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
            if (marks[i] > highestmarks) {
                highestmarks = marks[i];

            }
        }
        System.out.println("MARKS OF ALL STUDENTS:");
        for (int i=0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    
    double averagemarks = (double)total/n;
    System.out.println("AVERAGE MARKS:"+averagemarks);

    System.out.println("HEIGHEST MARKS"+highestmarks);
   
    }
}

