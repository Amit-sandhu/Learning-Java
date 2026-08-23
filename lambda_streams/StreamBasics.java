package lambda_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 20, 1, 15);

        // Streams let you chain operations without writing manual loops
        List<Integer> evenSorted = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(evenSorted);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+sum);

        long countAboveTen = numbers.stream().filter(n -> n > 10).count();
        System.out.println("Above 10: "+countAboveTen);

        numbers.stream().sorted().forEach(n -> System.out.print(n+" "));
        System.out.println();

        List<String> words = Arrays.asList("apple","banana","kiwi","cherry");
        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);
    }
}

// Practice: Use a stream to find the average of a List<Integer>
// (hint: IntStream has an .average() method that returns an OptionalDouble).
