package streamApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // Create a stream from a List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();
        numberStream.forEach(System.out::println);

        // Create a stream of strings from an array
        String[] names = {"Alice", "Bob", "Charlie"};
        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out::println);

        // Create a stream of integers from 1 to 5 using range
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);

        Stream<String> stdinStream = new BufferedReader(new InputStreamReader(System.in)).lines();
        stdinStream.forEach(System.out::println);

    }
}
