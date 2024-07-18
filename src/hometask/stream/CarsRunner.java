package hometask.stream;

import java.util.List;
import java.util.stream.Stream;

public class CarsRunner {

    public static void main(String[] args) {

        Stream<String> carsStream = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
        List<String> cars = carsStream.distinct().filter(str -> str.contains("и")).skip(1).map(String::toUpperCase).toList();
        cars.forEach(System.out::println);
    }
}
