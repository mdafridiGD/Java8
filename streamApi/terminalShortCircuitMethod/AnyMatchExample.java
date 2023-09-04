package streamApi.terminalShortCircuitMethod;

import java.util.List;



public class AnyMatchExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10, 11, 12);

        boolean hasEvenNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        if (hasEvenNumber) {
            System.out.println("At least one even number found.");
        } else {
            System.out.println("No even numbers found.");
        }

    }
}