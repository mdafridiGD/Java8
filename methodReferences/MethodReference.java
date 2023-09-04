package methodReferences;

import methodReferences.pojo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MethodReference {
    public static void main(String[] args) {
//Method reference
//Call By Method

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("afridi"));
        personList.add(new Person("shivam"));
        personList.forEach(System.out::println);


//        StaticMethod reference
        Collections.sort(personList, ComparatorClass::compareByName1);
        System.out.println(personList);

//        Object reference to a particular type
        ComparatorClass comparatorClass = new ComparatorClass();
        Collections.sort(personList, comparatorClass::compareByName);
        System.out.println(personList);


//        Object Reference to an arbitary object of a particular type
        List<Person> people = new ArrayList<>();
        people.add(new Person("arbitray object1"));
        people.add(new Person("arbitray object2"));
        people.add(new Person("arbitray object3"));

        // Using a lambda expression
//        people.forEach( person -> person.getAge());


        // Using a method reference
        people.forEach(Person::getAge);

//        Constructor Reference
        PersonFactory personFactory = Person::new;
        Person person = personFactory.createPerson("Afridi");
        System.out.println("Person's name: " + person.getName());


    }
}
