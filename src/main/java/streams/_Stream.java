package streams;

import imperative.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
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

        Set<Gender> genders = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());

        System.out.println(genders);

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
