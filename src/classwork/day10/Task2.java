package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> mamaList = Arrays.asList("Мама", "мыла", "раму", "мыла");

        System.out.println(mamaList.stream().anyMatch("Мама"::equals));

        System.out.println();

        System.out.println(mamaList.stream().allMatch(str -> str.contains("м")));

        System.out.println();

        List<String> newMama = mamaList.stream().map(str -> str + "m").toList();
        newMama.forEach(str -> System.out.print(str + " "));

        System.out.println();
        System.out.println();

        List<String> newMana2 = mamaList.stream().flatMap(str -> Arrays.stream(str.split("а"))).filter(s -> !s.isEmpty()).toList();
        newMana2.forEach(System.out::println);

    }
}
