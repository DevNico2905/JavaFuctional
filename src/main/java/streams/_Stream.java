package streams;

import imperative.Main;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Jhon", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Amparo", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Diego", Gender.MALE),
                new Person("William", Gender.PREFER_NOT_TO_SAY)
        );

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

}
