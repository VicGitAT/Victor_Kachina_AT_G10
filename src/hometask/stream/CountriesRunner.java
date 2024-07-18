package hometask.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

        Stream<String> countriesStream = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        List<String> countries = countriesStream.filter(str -> (Arrays.stream(str.split("")).anyMatch(s -> s.matches("[аеёиоуыэюяАЕЁИОУЭЮЯ]")) && str.split("").length >= 7)).map(String::toUpperCase).map(str -> "\"" + str + "\"").toList();
        countries.forEach(System.out::println);
    }
}
