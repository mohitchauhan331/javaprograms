package basicprograms;
import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student id:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter Street:");
        String street = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter day of birth:");
        int day = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter month of birth:");
        int month = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.println("Enter year of birth:");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        Address address = new Address(street, city);
        DOB dob = new DOB(day, month, year);

        Student student = new Student(id, name, address, dob);

        System.out.println("Student details:");
        System.out.println("ID: " + student.id);  
        System.out.println("Name: " + student.name);
        System.out.println("Address: " + student.address);
        System.out.println("Date of Birth: " + student.dob);
    }
}
class Address {
    String street;
    String city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String toString() {
        return street + ", " + city;
    }
}
class DOB {
    int day;
    int month;
    int year;

    DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
class Student {
    int id;
    String name;
    Address address;
    DOB dob;

    Student(int id, String name, Address address, DOB dob) 
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
    }
}
