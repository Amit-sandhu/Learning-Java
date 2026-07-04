package cars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        // Car car2 = new Car();

        // System.out.println(car1.name);
        // System.out.println(car2.name);
        // System.out.println(car1.price);
        // System.out.println(car2.man_year);

        // car1.print_name();
        // car2.print_name();

        car1.isrunning();
        car1.move();
        car1.start();
        car1.move();
        car1.turn_left();
        car1.brake();
        car1.stop();
        car1.isrunning();
    }
}
