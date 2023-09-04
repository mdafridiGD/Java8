package streamApi.terminalShortCircuitMethod;

import java.util.List;
import java.util.Optional;


public class FindAnyExample {

    public static void main (String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange", "grape", "kiwi");


        Optional<String> anyFruit = fruits.parallelStream()
                .filter(fruit -> fruit.length() > 5)
                .findAny();

        if (anyFruit.isPresent()) {
            System.out.println("Found a fruit with more than 5 characters: " + anyFruit.get());
        } else {
            System.out.println("No fruit with more than 5 characters found.");
        }
    }
}