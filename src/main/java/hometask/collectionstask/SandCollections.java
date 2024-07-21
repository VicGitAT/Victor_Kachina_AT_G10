package main.java.hometask.collectionstask;

import main.java.hometask.collectionstask.objectfortask.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandCollections {

    public List<Sand> listSand() {
        List<Sand> sands = new ArrayList<>();
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));
        return sands;
    }

    public void printWeight(List<Sand> sands) {
        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
    }

    public void printName(List<Sand> sands) {
        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
    }

    public Map<Integer, Sand> mapSand(List<Sand> listSands) {
        Map<Integer, Sand> mapSands = new HashMap<>();
        for (int i = 0; i < listSands.size(); i++) {
            mapSands.put(i, listSands.get(i));
        }
        return mapSands;
    }

    public void printMapKeysSand(Map<Integer, Sand> mapSend) {
        for (Map.Entry<Integer, Sand> entry : mapSend.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void printMapValueSand(Map<Integer, Sand> mapSend) {
        for (Map.Entry<Integer, Sand> entry : mapSend.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void printMapKeysAndValue(Map<Integer, Sand> mapSend) {
        for (Map.Entry<Integer, Sand> entry : mapSend.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
