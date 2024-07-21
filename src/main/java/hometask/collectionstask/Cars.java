package main.java.hometask.collectionstask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cars {

    public List<String> listCars() {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");
        return cars;
    }

    public void printListCarsInFile(List<String> cars) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Vic\\Desktop\\cars.txt", true));
            for (String str : cars) {
                bufferedWriter.write("\"" + str + "\" ");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e + "please try again");
        }
    }

    public void deletingCarsWhoseNameIsMoreThanFourCharacters(List<String> cars) {
        for (int i = cars.size() - 1; i >= 0; i--) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
            }
        }
        for (String str : cars) {
            System.out.println(str);
        }
    }

    public void printCarsViaSpase(List<String> cars) {
        for (String str : cars) {
            System.out.println(str + " ");
        }
    }

}
