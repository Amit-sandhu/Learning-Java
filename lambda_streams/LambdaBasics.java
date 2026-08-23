package lambda_streams;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args){

        // a lambda is a short-hand way of implementing a functional interface
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3,4));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));

        Runnable greet = () -> System.out.println("Hello from a lambda!");
        greet.run();
    }
}

// Practice: Write a Predicate<String> that checks if a String has
// more than 5 characters, and test it on a couple of names.
