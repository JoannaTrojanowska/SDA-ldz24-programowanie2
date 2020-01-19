package pl.sdacademy.intermediate.basic.basic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basic2Lists {
    public static void main(String[] args) {

        Person person1 = new Person("Piotr", "Ziętek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Małysz", "Wisła", 42, 123456789);
        Person person3 = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        Person person4 = new Person("Juliusz", "Słowacki", "Kraków", 40, 10203040);
        Person person5 = new Person("Tomasz", "Kowalski", "Łódź", 12, 13342523);

        List<Person> myList = new ArrayList<>();
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        myList.add(person4);
        myList.add(person5);

        System.out.println(myList);


        showAgeMore20(myList);
        showSumOfAge(myList);
        showPhoneDivided2(myList);

        myList.stream()
                .sorted()
                .map(Person::getAge)
                .forEach(System.out::println);

        myList.stream()
                .filter(person -> person.getPhone() % 2 == 0)
                .forEach(System.out::println);

        myList.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(System.out::println);


        List<Person> personListCopy = new ArrayList<>(myList);
        myList.remove(person1);
        showPhoneDivided2(personListCopy);


    }

    public static void showAgeMore20(List<Person> myList) {
        for (Person p : myList) {
            if (p.getAge() > 20) {
                System.out.println(p);
            }
        }
    }

    public static void showSumOfAge(List<Person> myList) {
        int sum = 0;
        for (Person p : myList) {
            sum += p.getAge();
        }
        System.out.println("Sumia wieku wszystkich osób: " + sum);
    }

    public static void showPhoneDivided2(List<Person> myList) {
        for (Person p : myList
        ) {
            if (p.getPhone() % 2 == 0) {
                System.out.println(p);
            }
        }
    }


}
