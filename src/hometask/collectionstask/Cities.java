package hometask.collectionstask;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public List<String> listCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        return cities;
    }

    public void printCities(List<String> cities) {
        for (String str : cities) {
            System.out.println(str);
        }
    }

    public void countingLetterInList(List<String> cities) {
        int counterLetter = 0;
        for (String str : cities) {
            counterLetter += str.length();
        }
        System.out.println(counterLetter + " in list");
    }

    public void printLitViaIndex(List<String> cities) {
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
