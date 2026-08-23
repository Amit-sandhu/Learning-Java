package interfaces;

// a functional interface has exactly one abstract method,
// which makes it usable with lambda expressions (see lambda_streams/)
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println(add.operate(4,5));
        System.out.println(multiply.operate(4,5));
    }
}

// Practice: Write a third Calculator lambda for subtraction and call it.
