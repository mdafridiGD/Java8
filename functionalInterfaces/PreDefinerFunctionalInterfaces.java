package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import methodReferences.pojo.Person;

public class PreDefinerFunctionalInterfaces {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Afridi"));
        people.add(new Person("Shivam"));
        people.add(new Person("Rishav"));

//        Predicate Interface
        Predicate<Person> agePredicate = person -> person.getName().startsWith("A");
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people) {
            if (agePredicate.test(person)) {
                filteredPeople.add(person);
            }
        }

        System.out.println(filteredPeople); //        output will be [Person{name='Afridi'}]

//        Consumer Interface
        // Using Consumer to invoke the getAge method
        Consumer<Person> ageOfConsumer = person -> person.getAge();
        people.forEach(ageOfConsumer);
//        output will be
// Age of object of a particular type
//Age of object of a particular type
//Age of object of a particular type


//        Function Interface

        Function<Person, String> upperCasePerson = person -> person.getName().toUpperCase();
        List<Person> transformedPeople = new ArrayList<>();
        for (Person person : people) {
            String upperName = upperCasePerson.apply(person);  // Convert name to uppercase
            person.setName(upperName);  // Update the name in the Person object
            transformedPeople.add(person);}
        System.out.println(transformedPeople);     //  output will be  [Person{name='AFRIDI'}, Person{name='SHIVAM'}, Person{name='RISHAV'}]



//    Supplier Interface
        Supplier<String> helloSupplier = () -> "Hello, Afridi";

        // Using the Supplier to retrieve the supplied value
        String message = helloSupplier.get();
        System.out.println(message);
//        output will be  Hello, Afridi

    }
}