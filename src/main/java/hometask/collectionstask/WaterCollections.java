package main.java.hometask.collectionstask;

import main.java.hometask.collectionstask.objectfortask.Water;

import java.util.ArrayList;
import java.util.List;

public class WaterCollections {

    public List<Water> listWatter() {
        List<Water> water = new ArrayList<>();
        water.add(new Water("Прозрачная", "Нет"));
        water.add(new Water("Прозрачная", "Нет"));
        water.add(new Water("Мутная", "Аммиачный"));
        return water;
    }

    public void printColorAndSmellWatter(List<Water> water) {
        for (Water water1 : water) {
            System.out.println(water1.getColor() + " - " + water1.getSmell());
        }
    }
}
