package pl.sdacademy.intermediate.basic.basic9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic9Streams {

    public static void main(String[] args) {


        Stream<String> namesStream = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesStream
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesList
                .stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(person -> System.out.println("Person: " + person.getName() + " is adult."));

        allPersons
                .stream()
                .peek(person -> System.out.println(person.getCity()))
                .forEach(System.out::println);


        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!
                .forEach(name -> System.out.println("Person: " + name + " is adult."));


        allPersons
                .stream()
                .skip(1)
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        allPersons
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge)) // natural order (od najmłodszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed()) // natural order, odwrotnie (od najstarszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparing(Person::getName)) // natural order, alfabetycznie, inaczej zrobione
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName())) // ekwiwalent powyższego, „na piechotę”
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        List<Person> adultsOnly = allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getCity().equals("Zgierz"))
                .collect(Collectors.toList());

            System.out.println(adultsOnly);

        String namesJoinedByHyphen = allPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(" – "));

            System.out.println(namesJoinedByHyphen);


        List<Integer> firstList = Arrays.asList(1, 2, 3);
        List<Integer> secondList = Arrays.asList(4, 5, 6);
        List<Integer> thirdList = Arrays.asList(7, 8, 9);

        Stream<List<Integer>> streamOfLists = Stream.of(firstList, secondList, thirdList);

        streamOfLists
                .flatMap(Collection::stream) // wskazujemy, co robimy z każdą listą, tutaj tworzymy z każdej strumień liczb
                .forEach(System.out::println);

        System.out.println("Hello world!");
        System.out.println("Hello world!");


    }
}
