package basicprograms;
interface resizable {
    void resize(double x );
} 
class Rectangle implements resizable { 
    double width;
    double height;
    public Rectangle(double width , double height) 
    {   this.width = width;
        this.height = height;

    }
    public double getArea() 
    {
        return width * height;
    }
    public double getPerimeter() 
    {
        return 2 * (width+height);
    } 
    public void resize(double x ) {
        width *= x;
        height *= x;

    }
    }
    public class demo1{
        public static void main (String[]args) {
            Rectangle rectangle = new Rectangle(2,3);
            System.out.println("original rectangle:");
            System.out.println("area :" +rectangle.getArea());
            System.out.println("perimeter :" +rectangle.getPerimeter());
            rectangle.resize(2);
            System.out.println("\nresized rectangle :");
            System.out.println("area :" +rectangle.getArea());
            System.out.println("perimeter :" +rectangle.getPerimeter());
        }
    }