package cars;

public class Car {

    String name = "mustang";
    int man_year = 1988;
    double price = 78999.99;                           //object : an entity that holds data
    boolean isrunning = false;                         //    and can perform actions(methods).
    void isrunning() {                                 //    It is a refrence data type.
        if (isrunning) {
            System.out.println("The car is running!");
        } else {
            System.out.println("The car is not running!");
        }
    }

    void print_name() {
        System.out.println();
    }

    void start() {
        System.out.println("you started the car!");
        isrunning = true;
    }

    void stop() {
        System.out.println("you stopped the car!");
        isrunning = false;
    }

    void turn_right() {
        System.out.println("the car took a right turn!");
    }

    void turn_left() {
        System.out.println("the car took a left turn!");
    }

    void move() {
        if (isrunning) {
            System.out.println("the car is moving forward!");
        } else {
            System.out.println("You didn't start the car yet !");
        }
    }

    void brake() {
        System.out.println("the car stopped due to brake!");
    }
}
