package basicprograms;

public class Abstraction{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();       
        rectangle.draw();    
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
