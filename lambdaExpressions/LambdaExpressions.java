package lambdaExpressions;

import methodReferences.pojo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExpressions {
    public static void main(String[] args) {
//        Lambda Expressions;
//        return type lambda
        Integer[] a = {1, 2, 3, 4, 5};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(a));

        // Using anonymous class
        numbers.removeIf(number ->
                 number % 2 == 0);

        System.out.println(numbers);


//zero parameter
        Runnable zeroParameterLambda = () -> {
            System.out.println("I am zero-parameter lambda");
        };
        zeroParameterLambda.run();
//Curly Brackets can be removed.


// Single Parameter
//        non-return type
        Consumer<String> singleParameterLambda = (name) -> {
            System.out.println("Hi, " + name);
        };
        singleParameterLambda.accept("I am single parameter lambda");
//bracket can be removed about parameter.


//        Multiple Parameter and BiFunction
        BiFunction<Integer, Integer, Integer> addLambda = (x, y) -> x + y;

        int result = addLambda.apply(5, 3);
        System.out.println("Result of Multi parameter: " + result);


//unary function

        Function<Integer, Integer> negativeOperation = num -> -num;

        int number1 = 5;
        int result1 = negativeOperation.apply(number1);

        System.out.println("Negative of " + number1 + " is " + result1);  // Output: Negative of 5 is -5


//Unary operator
        UnaryOperator<Integer> negation = num -> -num;

        int number2 = 5;
        int result2 = negation.apply(number2);

        System.out.println("Negation by unary operator " + number2 + " is " + result2);


//        Binary operator

        BinaryOperator<Integer> addition = (x, y) -> x + y;
        int x = 5;
        int y = 5;
        int sum = addition.apply(x, y);

        System.out.println("sum of " + x + " and " + y + " is " + sum);  // Output: sum of 5 and 5 is 10


//        After Functional Interface
        //Predicate
        Predicate<String> isStartWithA = name -> name.startsWith("A") ;
        System.out.println("Is name start with A? " + isStartWithA.test("Afridi"));

        //         Consumer: Printing square of a number
        Consumer<Person> printCube = person -> System.out.println("Consumer Lambda Expression " + person + " is " + person.getName());
        printCube.accept(new Person("Afridi"));


        //         Function: Converting Fahrenheit to Celsius
        Function<Person, String> upperCasePerson = person -> person.getName().toUpperCase();
        String upperName = upperCasePerson.apply(new Person("Afridi"));
        System.out.println("Name with upper case: " + upperName);


        //         Supplier: Generating a random number
        Supplier<String> helloSupplier = () -> "Hello Afridi";
        System.out.println("Supplier lambda expression: " + helloSupplier.get());

    }
}