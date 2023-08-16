import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PreDefinerFunctionalInterfaces {
    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("Apple","Guava","Banana");

//        Consumer Interface
//        fruits.forEach( new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println("I love " + fruit);
//            }
//        });

//        Function Interface
//        List<String> upperCase = fruits.stream()
//                .map(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.toUpperCase();
//                    }
//                }).collect(Collectors.toList());
//
//        System.out.println(upperCase);

//        Predicate Interface
//        List<String> filtered=fruits.stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        if(s.startsWith("A"))return true;
//                        else return false;
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(filtered);

    }
}
