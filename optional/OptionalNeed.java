package optional;

import java.util.Optional;

public class OptionalNeed {
//    public static void main(String[] args) {
//
//        String input = getInput(); // Simulated method that may return null
//
//        if (input != null) {
//            // Do something with the non-null input
//            System.out.println("Length of input: " + input.length());
//        } else {
//            // Handle the case where input is null
//            System.out.println("Input is null.");
//        }
//    }
//
//    private static String getInput() {
//        // Simulated method that may return null
//        return null;
//    }
//}

//    //    With Optional
        public static void main (String[]args){
            Optional<String> optionalInput = getInput(); // Simulated method that returns an Optional

            optionalInput.ifPresent(input -> {
                // Do something with the non-null input
                System.out.println("Length of input: " + input.length());
            });

            if (!optionalInput.isPresent()) {
                // Handle the case where input is absent (empty)
                System.out.println("Input is absent.");
            }
        }

        private static Optional<String> getInput () {
            // Simulated method that returns an Optional
            return Optional.ofNullable(null); // Return Optional.empty() for null input
        }
    }