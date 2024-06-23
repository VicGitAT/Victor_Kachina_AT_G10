package classwork.day8;

import java.util.*;

public class Day8Task4 {
    public static void main(String[] args) {

        Set<String> listOne = new HashSet<>();
        Set<String> listTwo = new TreeSet<>();
        int numberOperation = 1_000_000;

        long time = System.currentTimeMillis();
        for (int i = 0; i <= numberOperation; i++) {
            listOne.add("bugaga" + i);
        }
        System.out.println("time add operation with " + numberOperation + " elements HashSet: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis()- time) / 1000) / 60) + " min.");


        time = System.currentTimeMillis();
        for (int i = 0; i <= numberOperation; i++) {
            listTwo.add("bugaga" + i);
        }
        System.out.println("time add operation with " + numberOperation + " elements TreeSet: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");


        time = System.currentTimeMillis();
        for (String s : listOne){
        }
        System.out.println("time operation with " + numberOperation + " elements HashSet: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");

        time = System.currentTimeMillis();
        for (String s : listTwo){
        }
        System.out.println("time operation with " + numberOperation + " elements TreeSet: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");
    }
}
