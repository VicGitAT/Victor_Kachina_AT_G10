package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class Day8Task1 {

    public static void main(String[] args) {

        task1();

    }

    public static void task1() {
        List<String> myList = new ArrayList<>();
        String myString = "мама мыла раму";
        String[] arrayString = myString.split(" ");

        for (String s : arrayString) {
            myList.add(s);
            System.out.println(s);
        }
    }
}
