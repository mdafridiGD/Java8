import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        //    Optional Class
        Optional<String> optionalWithValue = Optional.of("Afridi");
        System.out.println(optionalWithValue);
//
//        // Creating an Optional with a potentially null value using ofNullable()
        String nullableValue = null;
        Optional<String> optionalWithNullableValue = Optional.ofNullable(nullableValue);
        System.out.println(optionalWithNullableValue);

//        // Checking if an Optional has a value using isPresent()
        if (optionalWithValue.isPresent()) {
            System.out.println("optionalWithValue is present: " + optionalWithValue.get());
        }
//
        if (optionalWithNullableValue.isPresent()) {
            System.out.println("optionalWithNullableValue is present: " + optionalWithNullableValue.get());
        } else {
            System.out.println("optionalWithNullableValue is not present.");
        }
//
//        // Using orElse() to provide a default value if Optional is empty
        String valueOrDefault = optionalWithNullableValue.orElse("Default Value");
        System.out.println("Value or Default: " + valueOrDefault);
//
//        // Using orElseThrow() to throw an exception if Optional is empty
        try {
            String valueOrThrow = optionalWithNullableValue.orElseThrow(() -> new IllegalArgumentException("Value is missing"));
            System.out.println("Value or Throw: " + valueOrThrow);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
