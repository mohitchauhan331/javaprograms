package basicprograms;

abstract class shape {
    int numSides;

    public shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Rectangle extends shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class RightTriangle extends shape {
    double width;
    double height;

    public RightTriangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * width * height;
    }

    public double getPerimeter() {
        
        return -1;
    }
}

public class demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle:");
        System.out.println("number of sides: " + rectangle.getNumSides());
        System.out.println("area: " + rectangle.getArea());
        System.out.println("perimeter: " + rectangle.getPerimeter());

        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println("\nRightTriangle:");
        System.out.println("number of sides: " + triangle.getNumSides());
        System.out.println("area: " + triangle.getArea());
        System.out.println("perimeter: N/A");
    }
}
