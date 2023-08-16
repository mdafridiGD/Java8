import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMethods {
    public static void main(String[] args) {
        //        stream Methods

                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
                        List<String> names1=names.stream()
                        .collect(Collectors.toList());
        System.out.println(names1);

//                // 1. Filter: Select elements that match a given condition
                List<String> filteredNames = names.stream()
                        .filter(name -> name.length() > 3)
                        .collect(Collectors.toList());
                System.out.println("Filtered names: " + filteredNames);
//
//                // 2. Map: Transform elements into another type
                List<Integer> nameLengths = names.stream()
                        .map(String::length)
                        .collect(Collectors.toList());
                System.out.println("Name lengths: " + nameLengths);
//
//                // 3. Sorted: Sort elements in natural order or using a custom comparator
                List<String> sortedNames = names.stream()
                        .sorted()
                        .collect(Collectors.toList());
                System.out.println("Sorted names: " + sortedNames);
//
//                // 4. Collect: Accumulate elements into a collection or a result
                String nameConcatenation = names.stream()
                        .collect(Collectors.joining(", "));
                System.out.println("Concatenated names: " + nameConcatenation);
//
//                // 5. Reduce: Combine elements into a single result using a binary operation
                int nameLengthSum = names.stream()
                        .map(String::length)
                        .reduce(0, Integer::sum);
                System.out.println("Sum of name lengths: " + nameLengthSum);
//
//                // 6. Distinct: Remove duplicates from the stream
                List<String> distinctNames = names.stream()
                        .distinct()
                        .collect(Collectors.toList());
                System.out.println("Distinct names: " + distinctNames);
//
//                // 7. Limit: Limit the number of elements in the stream.....Short Circuit Intermediate Method
                List<String> limitedNames = names.stream()
                        .limit(3)
                        .collect(Collectors.toList());
                System.out.println("Limited names: " + limitedNames);
//
//                // 8. Skip: Skip the specified number of elements from the beginning
                List<String> skippedNames = names.stream()
                        .skip(2)
                        .collect(Collectors.toList());
                System.out.println("Skipped names: " + skippedNames);
//         FlatMap
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(namesFlatStream);

//ParallelStream

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");
        fruits.parallelStream().forEach(a->System.out.println(a));


//        Streams to count number of character

            String input="Hi I am Afridi";
            Map<Character, Long> mp = input.chars().
                    mapToObj(c ->Character.valueOf((char)c))
                    .collect(Collectors.groupingBy(p->p, LinkedHashMap::new, Collectors.counting()));
        System.out.println(mp);


    }
}
