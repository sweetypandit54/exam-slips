//slip 19
abstract class Shape 
{
    protected int width;
    protected int height;

    public Shape(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }

    public abstract void printArea();
}

class Rectangle extends Shape 
{
    public Rectangle(int width, int height) 
    {
        super(width, height);
    }
    @Override
    public void printArea() 
    {
        int area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape 
{
    public Triangle(int width, int height) 
    {
        super(width, height);
    }

    @Override
    public void printArea() 
    {
        double area = 0.5 * width * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape 
{
    public Circle(int radius) 
    {
        super(radius, 0); 
    }

    @Override
    public void printArea() 
    {
        double area = Math.PI * width * width;
        System.out.println("Area of Circle: " + area);
    }
}

public class print_area
{
    public static void main(String[] args) 
    {
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(6, 4);
        Shape circle = new Circle(3);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
