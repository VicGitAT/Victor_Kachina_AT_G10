package main.java.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counterMan = 0;
        int counterWoman = 0;

        for (Person person : personList) {
            if (person.getAge() >= 18 && person.getAge() <= 60 && person.getSex().equals(Person.Sex.MAN)) {
                counterMan++;
            }
            if (person.getAge() >= 18 && person.getAge() <= 55 && person.getSex().equals(Person.Sex.WOMEN)) {
                counterWoman++;
            }
        }

        System.out.println("через foreach");
        System.out.println("кол-во мужчин работоспособных: " + counterMan);
        System.out.println("кол-во женщин работоспособных: " + counterWoman);
        System.out.println("всего работоспособных людей: " + (counterMan + counterWoman));

        System.out.println("через stream");
        System.out.println("кол-во работоспособных мужчин: " + personList.stream().filter(person -> {
            return person.getAge() >= 18 && person.getAge() <= 60 && person.getSex().equals(Person.Sex.MAN);
        }).count());

        System.out.println("кол-во работоспособных женщин: " + personList.stream().filter(person -> {
            return person.getAge() >= 18 && person.getAge() <= 55 && person.getSex().equals(Person.Sex.WOMEN);
        }).count());

        System.out.println("всего работоспособных людей: " + personList.stream().filter(person -> {
            return (person.getAge() >= 18 && person.getAge() <= 60 && person.getSex().equals(Person.Sex.MAN)) || person.getAge() >= 18 && person.getAge() <= 55 && person.getSex().equals(Person.Sex.WOMEN);
        }).count());
    }
}
