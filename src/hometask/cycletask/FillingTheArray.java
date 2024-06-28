package hometask.cycletask;

import java.util.Random;

public class FillingTheArray {

    public int[] returnIntArrayWithRandomNumbers() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
