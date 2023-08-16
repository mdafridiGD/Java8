import java.util.function.*;

public class LambdaExpressions {
    public static void main(String[] args) {
  //        Lambda Expressions

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 2 even? " + isEven.test(2));

//         Function: Converting Fahrenheit to Celsius
        Function<Double, Double> fahrenheitToCelsius = f -> (f - 32) * 5/9;
        double celsius = fahrenheitToCelsius.apply(2.0);
        System.out.println("2°F in Celsius: " + celsius);

//         Consumer: Printing square of a number
        Consumer<Integer> printCube = num -> System.out.println("Cube of " + num + " is " + num * num * num);
        printCube.accept(5);

//         Supplier: Generating a random number
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 2);
        System.out.println("Random number: " + randomNumber.get());


//zero parameter
        Runnable zeroParameterLambda = () -> {
            System.out.println("Hello from zero-parameter lambda!");
        };
        zeroParameterLambda.run();
//Curly Brackets can be removed.

// Single Parameter
        Consumer<String> singleParameterLambda = (name) -> {
            System.out.println("Hi, " + name );
        };
        singleParameterLambda.accept("Afridi");
//bracket can be removed about parameter.




//        Multiple Parameter
        BiFunction<Integer, Integer, Integer> addLambda = (x, y) -> x + y;

        int result = addLambda.apply(5, 3);
        System.out.println("Result: " + result);




//unary function

        Function<Integer, Integer> negativeOperation = num -> 0 - num;

        int number1 = 15;
        int result1 = negativeOperation.apply(number1);

        System.out.println("Negative of " + number1 + " is " + result1);  // Output: Negative of 15 is -15



//Unary operator
        UnaryOperator<Integer> negation = num -> -num;

        int number2 = 5;
        int result2 = negation.apply(number2);

        System.out.println("Negation of " + number2 + " is " + result2);






//        Binary operator

        BinaryOperator<Integer> addition = (x, y) -> x + y;
        int x = 6;
        int y = 8;
        int sum = addition.apply(x, y);

        System.out.println("sum of " + x + " and " + y + " is " + sum);  // Output: sum of 6 and 8 is 14










    }
}
