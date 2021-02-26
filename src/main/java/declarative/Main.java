package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) {
        List<Person> people = new ArrayList<Person>();

        Person james = new Person("James", Gender.MALE);
        Person maria = new Person("Maria", Gender.FEMALE);
        Person aisha = new Person("Aisha", Gender.FEMALE);
        Person alex = new Person("Alex", Gender.MALE);
        Person alice = new Person("Alice", Gender.FEMALE);

        people.add(james);
        people.add(maria);
        people.add(aisha);
        people.add(alex);
        people.add(alice);

        //Declarative approach
        System.out.println("Declarative Approach");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .forEach(System.out::println);
    }

    public static class Person {
        private final String name;
        private final Gender gender;

        public Person(
                String name,
                Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
