package basicprograms;

import java.util.Scanner;

public class circlee {
    private double radius;

    public circlee(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        circlee circle = new circlee(radius);

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Circumference of the circle: " + circle.circumference());

        scanner.close();
    }
}
