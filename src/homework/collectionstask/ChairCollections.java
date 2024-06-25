package homework.collectionstask;

import homework.collectionstask.objectfortask.Chair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairCollections {

    public List<Chair> listChair() {
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new Chair(1, 2));
        chairs.add(new Chair(4, 2));
        chairs.add(new Chair(2, 4));
        return chairs;
    }

    public void printProductHeightByWidth(List<Chair> chairs) {
        for (Chair chair : chairs) {
            System.out.println(chair.getHeight() * chair.getWidth());
        }
    }

    public Map<Integer, Chair> mapSand(List<Chair> listChair) {
        Map<Integer, Chair> mapChair = new HashMap<>();
        for (int i = 0; i < listChair.size(); i++) {
            mapChair.put(i, listChair.get(i));
        }
        return mapChair;
    }

    public void printMapKeysSand(Map<Integer, Chair> mapChair) {
        for (Map.Entry<Integer, Chair> entry : mapChair.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void printMapValueSand(Map<Integer, Chair> mapChair) {
        for (Map.Entry<Integer, Chair> entry : mapChair.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void printMapKeysAndValue(Map<Integer, Chair> mapChair) {
        for (Map.Entry<Integer, Chair> entry : mapChair.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
