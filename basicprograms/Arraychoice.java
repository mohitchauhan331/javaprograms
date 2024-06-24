package basicprograms;

import java.util.Scanner;

public class Arraychoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons = ");
        int n = scanner.nextInt();
        Employee[] e1 = new Employee[n];

        for (int i = 0; i < n; i++) {
            e1[i] = new Employee();
            e1[i].setData(); 
        }
        
        System.out.println("Person Details are = ");
        for (int i = 0; i < n; i++) {
            e1[i].printData();
        }
    }
}

class Employee {
    int id;
    String name;

    void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id :");
        id = scanner.nextInt();
        System.out.print("Enter name :");
        name = scanner.next();
    }

    void printData() {
        System.out.println("ID = " + id + "\t\tName = " + name);
    }
}