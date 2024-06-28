package hometask.collectionstask;

import hometask.collectionstask.objectfortask.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonCollections {

    public List<Person> listBubble() {
        List<Person> person = new ArrayList<>();
        person.add(new Person(32, "Коля"));
        person.add(new Person(24, "Оля"));
        person.add(new Person(55, "Вася"));
        person.add(new Person(63, "Маша"));
        return person;
    }

    public void printAgePerson(List<Person> person) {
        for (Person person1 : person) {
            System.out.println(person1.getName());
        }
    }

    public void printNamePerson(List<Person> person) {
        for (Person person1 : person) {
            System.out.println(person1.getAge());
        }
    }

    public void printPerson(List<Person> person) {
        for (Person person1 : person) {
            System.out.println(person1.toString());
        }
    }
}
