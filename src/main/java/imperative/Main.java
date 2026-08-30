package imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        List<Person> people = List.of(
                new Person("Jhon", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Amparo", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Diego", Gender.MALE)
        );

        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }
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
        MALE, FEMALE
    }

}
