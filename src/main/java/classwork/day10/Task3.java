package main.java.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        List<String> mamaList = Arrays.asList("Мама", "мыла", "раму", "мыла");

        List<String> mamaList2 = mamaList.stream().sorted().toList();
        mamaList2.forEach(System.out::println);

        System.out.println();

        List<String> mamaList3 = mamaList.stream().sorted((a, b) -> -a.compareTo(b)).distinct().toList();
        mamaList3.forEach(System.out::println);

        System.out.println();

        List<Person> personList1 = personList.stream().sorted((a, b) -> {
            if (a.getSex().compareTo(b.getSex()) == 0) {
                return a.getAge() - b.getAge();
            } else {
                return a.getSex().compareTo(b.getSex());
            }
        }).toList();
        personList1.forEach(person -> System.out.println(person.toString()));
    }
}
