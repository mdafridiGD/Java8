package methodReferences.instanceMethodOfParticularType;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class StringUtils {
    public boolean startsWithUpperCase(String s) {
        return Character.isUpperCase(s.charAt(0));
    }
}




public class InstanceMethodReferenceExample {
    public static int countWordsStartingWithUppercase(List<String> words, Predicate<String> predicate) {
        int count = 0;
        for (String word : words) {
            if (predicate.test(word)) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "Cherry", "date");

        // Reference to an instance method of an arbitrary object of a particular type
        StringUtils stringUtils = new StringUtils();

        int count = countWordsStartingWithUppercase(words, stringUtils::startsWithUpperCase);

        System.out.println("Number of words starting with uppercase letter: " + count);
    }
}
