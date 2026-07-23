package inheritance;

abstract class Shape {

    abstract double area();

}

class Circle extends Shape {

    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {

    double length = 4;
    double breadth = 3;

    double area() {
        return length * breadth;
    }

}
public class Abstract {
    public static void main(String[] args){
        Shape s = new Circle();
        System.out.println(s.area());

        s = new Rectangle();
        System.out.println(s.area());
    } 
}

// What is an abstract class and why do we need it?

// An abstract class is a class that cannot be used to make its own objects.
// It is used as a blueprint for related classes.
// It can contain both normal methods and abstract methods.
// Abstract methods have no body, so every child class must provide
// its own implementation when the behavior differs for each child.