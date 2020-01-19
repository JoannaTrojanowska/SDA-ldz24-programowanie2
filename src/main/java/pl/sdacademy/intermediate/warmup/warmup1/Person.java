package pl.sdacademy.intermediate.warmup.warmup1;

import java.io.PrintStream;

public class Person {

    String name;
    String surname;
    String placeOfBirth;
    int age;
    long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }


    public Person() {
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", surname='" + surname + '\'' +
                "m. ur.:" + placeOfBirth + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public static void showPerson(String name, String surname, String placeOfBirth, int age, long phone){

        System.out.printf("%s %s (ur. %d r.)\n m. ur.:  %s \ntel: %d \n", name, surname, (2020 - age),  placeOfBirth, phone);
    }
}
