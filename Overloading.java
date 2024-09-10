// Implement program for a geometric shapes application
//that utilizes function overloading for calculating properties such as area and perimeter.
//Implement overloaded methods for computing area and perimeter for different shapes (e.g.,
//rectangles, circles, triangles) with varying sets of parameters
public class Overloading {

    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public float area(float length, float width) {
        return length * width;
    }
    public static double area(double base, double height){
        return 0.5* base* height;
    }

    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        System.out.println("Rectangle Area: " + area(5.0, 3.0));
        System.out.println("Circle Area: " + area(7));
        System.out.println("Triangle Area: " + area(6.0, 4.0));

        System.out.println("Rectangle Perimeter: " + perimeter(5.0, 3.0));
        System.out.println("Circle Perimeter: " + perimeter(7));
        System.out.println("Triangle Perimeter: " + perimeter(3.0, 4.0, 5.0));
    }
}

