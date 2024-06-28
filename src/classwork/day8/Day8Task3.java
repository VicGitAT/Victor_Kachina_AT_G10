package classwork.day8;

import java.util.*;

public class Day8Task3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] myArrayString = "Mama мыла раму".split(" ");
        for (String s : myArrayString) {
            mySet.add(s);
            System.out.println(s);
        }

        System.out.println();

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
