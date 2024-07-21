package main.java.hometask.cycletask;

public class SortArray {

    public void sortByMinimal(int[] array) {
        int variableForChangePosition;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] < array[j + 1]) {
                    variableForChangePosition = array[j + 1];
                    array[j + 1] = array[i];
                    array[i] = variableForChangePosition;
                }
            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }

    public void sortByMax(int[] array) {
        int variableForChangePosition;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    variableForChangePosition = array[j + 1];
                    array[j + 1] = array[i];
                    array[i] = variableForChangePosition;
                }

            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }

}
