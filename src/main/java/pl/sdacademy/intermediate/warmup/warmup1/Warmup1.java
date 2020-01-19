package pl.sdacademy.intermediate.warmup.warmup1;

public class Warmup1 {


    public static void main(String[] args) {

        //System.out.println("Hello world!");

        Person person1 = new Person("Adam", "Nowak", "Łódź", 31, 123456789);
        Person person2 = new Person();

        System.out.println(person1);
        person1.showPerson("Adam", "Nowak", "Łódź", 31, 123456789);
        person2.showPerson("Jan", "Kowalski", "Warszawa", 65, 987654321);



    }

}
