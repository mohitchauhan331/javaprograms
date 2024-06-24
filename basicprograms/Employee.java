package basicprograms;

import java.util.Scanner;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private int daysWorked;

    public Employee(String name, int id, double salary, int daysWorked) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.daysWorked = daysWorked;
    }

    public double calculateSalary() {
        final int workingdaysinamonth = 30;
        return (salary /workingdaysinamonth) * daysWorked;
    }

    public void printDetails() {
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Days Worked: " + daysWorked);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter id:");
        int id = scanner.nextInt();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter days worked:");
        int daysWorked = scanner.nextInt();

        Employee employee = new Employee(name, id, salary, daysWorked);

        employee.printDetails();
        System.out.println("Calculated Salary: " + employee.calculateSalary());
    }
}
