package hometask.stream;

import java.util.Arrays;
import java.util.List;

public class CitiesRunner {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Минск", "Москва", "Берлин");
        System.out.println(cities.stream().mapToInt(var -> var.split("").length).sum());
    }
}
