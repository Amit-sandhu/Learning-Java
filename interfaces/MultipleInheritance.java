package interfaces;

// a class can only extend one class, but it can implement many interfaces
// this is how Java achieves multiple inheritance of behaviour

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly(){
        System.out.println("The duck flies low over the pond");
    }
    public void swim(){
        System.out.println("The duck swims across the pond");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}

// Practice: Create a Human class implementing only Swimmable, and a
// Plane class implementing only Flyable, to see interfaces are optional per class.
