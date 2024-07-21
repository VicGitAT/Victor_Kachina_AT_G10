package main.java.classwork.day8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day8Task5 {

    public static void main(String[] args) {
        String[] myArrayString = "Mama мыла раму".split(" ");
        Map<Integer, String> myMap = new HashMap<>();
        for (int i = 0; i < myArrayString.length; i++) {
            myMap.put(i, myArrayString[i]);
            System.out.println(myMap.get(i));
        }

        Set<Integer> keys = myMap.keySet();
        for (int key : keys) {
            System.out.println(key);
        }

        Collection<String> values = myMap.values();
        for (String val : values) {
            System.out.println(val);
        }

        for (Map.Entry<Integer, String> entity : myMap.entrySet()) {
            System.out.println(entity);
        }



    }
}
