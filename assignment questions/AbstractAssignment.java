
import java.util.Scanner;

// Abstract class acts as a blueprint for all shapes.
abstract class Shape {

    String color;

    // Abstract methods must be implemented by child classes.
    abstract double area();
    abstract double perimeter();

    // Concrete method common to all shapes.
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    double radius;

    Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(String color, double length, double breadth) {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class EqTriangle extends Shape {

    double height;
    double base;
    double side;

    EqTriangle(String color, double height, double base, double side) {
        this.color = color;
        this.height = height;
        this.base = base;
        this.side = side;
    }

    double area() {
        return 0.5 * base * height;
    }

    double perimeter() {
        return 3 * side;
    }
}

public class AbstractAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of Shape objects (runtime polymorphism)
        Shape[] shapes = new Shape[3];

        // Circle input
        System.out.print("Enter circle color: ");
        String cColor = sc.next();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        shapes[0] = new Circle(cColor, radius);

        // Rectangle input
        System.out.print("\nEnter rectangle color: ");
        String rColor = sc.next();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        shapes[1] = new Rectangle(rColor, length, breadth);

        // Triangle input
        System.out.print("\nEnter triangle color: ");
        String tColor = sc.next();

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        shapes[2] = new EqTriangle(tColor, height, base, side);

        // Display details of every shape

        for (Shape s : shapes) {

            System.out.println("\nShape Type: " + s.getClass().getSimpleName());
            s.displayColor();
            System.out.printf("Area: %.2f\n", s.area());
            System.out.printf("Perimeter: %.2f\n", s.perimeter());
        }

        sc.close();
    }
}

// What is an abstract class and why do we need it?

// - An abstract class cannot be instantiated.
// - It is used as a blueprint for related classes.
// - It can contain both normal and abstract methods.
// - Abstract methods have no body, so every child class
//   must provide its own implementation.
