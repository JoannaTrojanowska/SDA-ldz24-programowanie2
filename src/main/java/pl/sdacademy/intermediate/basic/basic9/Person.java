package pl.sdacademy.intermediate.basic.basic9;

public class Person {

    String name;
    String surname;
    String city;
    int age;
    int pesel;


    public Person(String name, String surname, String city, int age, int pesel) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
