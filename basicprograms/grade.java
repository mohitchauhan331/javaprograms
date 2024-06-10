package basicprograms;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter the marks for subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter the marks for subject 3: ");
        int subject3 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3;

        double percentage = (double) totalMarks / 300 * 100;

        String grade;
        if (percentage >= 91 && percentage <= 100) {
            grade = "A+";
        } else if (percentage >= 81 && percentage <= 90) {
            grade = "A";
        } else if (percentage >= 71 && percentage <= 80) {
            grade = "B+";
        } else if (percentage >= 61 && percentage <= 70) {
            grade = "B";
        } else if (percentage >= 51 && percentage <= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

