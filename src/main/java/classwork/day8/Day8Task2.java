package main.java.classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day8Task2 {

    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new LinkedList<>();
        int numberOperation = 1_000_000;

        long time = System.currentTimeMillis();
        for (int i = 0; i <= numberOperation; i++) {
            listOne.add("bugaga" + i);
        }
        System.out.println("time add operation with " + numberOperation + " elements ArrayList: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis()- time) / 1000) / 60) + " min.");


        time = System.currentTimeMillis();
        for (int i = 0; i <= numberOperation; i++) {
            listTwo.add("bugaga" + i);
        }
        System.out.println("time add operation with " + numberOperation + " elements LinkedList: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");


        time = System.currentTimeMillis();
        for (int i = 0; i < numberOperation; i++) {
            listOne.get(i);
        }
        System.out.println("time get operation with " + numberOperation + " elements LinkedList: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");

        time = System.currentTimeMillis();
        for (int i = 0; i < numberOperation; i++) {
            listTwo.get(i);
        }
        System.out.println("time get operation with " + numberOperation + " elements LinkedList: " + (System.currentTimeMillis() - time) + " ms; " + ((System.currentTimeMillis() - time) / 1000) + " sec; " + (((System.currentTimeMillis() - time) / 1000) / 60) + " min.");
    }


}

