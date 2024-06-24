package basicprograms;

import java.util.Scanner;

public class fields {
    static Scanner scanner = new Scanner(System.in);

    static class Stu {
        int rollNo;
        String name;
        int mobNo;
        String address;
        String parentname;

        void getData() {
            System.out.print("Give roll no: ");
            this.rollNo = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Give name: ");
            this.name = scanner.nextLine();

            System.out.print("Give mob no: ");
            this.mobNo = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Give address: ");
            this.address = scanner.nextLine();

            System.out.print("Give parent's name: ");
            this.parentname = scanner.nextLine();
        }

        void displayData() {
            System.out.println("Roll no: " + this.rollNo);
            System.out.println("Name: " + this.name);
            System.out.println("Mob No: " + this.mobNo);
            System.out.println("Address: " + this.address);
            System.out.println("Parent's Name: " + this.parentname);
        }
    }

    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.getData();
        s1.displayData();
    }
}
