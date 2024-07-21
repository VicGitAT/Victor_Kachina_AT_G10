package main.java.hometask.cycletask;

public class FindingTheMinimumElementOfArray {

    public void findMinimumElement(int[] array) {
        int minElement = array[0];
        for (int j : array) {
            if (minElement > j) {
                minElement = j;
            }
        }
        System.out.println("минимальный элемент массива равен: " + minElement);
    }

}
